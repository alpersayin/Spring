package com.alpersayin.hibernate.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Address;
import com.alpersayin.hibernate.entity.Demirbas;
import com.alpersayin.hibernate.entity.Person;


public class Transactions {
	

	public Scanner in = new Scanner(System.in);
	
	public SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml") 
			.addAnnotatedClass(Person.class)
			.addAnnotatedClass(Address.class)
			.addAnnotatedClass(Demirbas.class)
			.buildSessionFactory();
	
	public Session session;
	
	public Person p = new Person();
	public Demirbas d = new Demirbas();
	
	public void startSession() {
		session = factory.getCurrentSession();
		session.beginTransaction();
	}
	
	public void commitSession() {
		session.getTransaction().commit();
	}
	
	public void addPerson() {
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		System.out.println("Kisisel Bilgileri Giriniz");
		System.out.print("Adi: ");
		String adi = in.next();
		System.out.print("Soyadi: ");
		String soyadi = in.next();
		System.out.print("Email: ");
		String email = in.next();
		System.out.print("Telefon: ");
		String telefon = in.next();
		
		Person person = new Person(adi, soyadi, email, telefon);
		session.save(person);
		
		System.out.println("Adres Bilgilerini Giriniz");
		System.out.print("Sokak/Mahalle: ");
		String sokak = in.next();
		System.out.print("Semt: ");
		String semt = in.next();
		System.out.print("Sehir: ");
		String sehir = in.next();
		
		Address address = new Address(sokak, semt, sehir);
		address.setPerson(person);
		person.setAddress(address);
		session.save(address);
		
		session.getTransaction().commit();
		System.out.println("Personel eklendi.");
	}
	
	public void removePerson() {
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		List<Person> personList = getListFromDB(p); 
		printList(personList);
		
		System.out.println("Silmek istediginiz Personelin numarasýný giriniz: ");
		int i = in.nextInt();
	
		int id = personList.get(i-1).getId();
		Person person = session.get(Person.class, id);
		
		if (person.getDemirbaslar() != null) {
			for (int j = 0; j < person.getDemirbaslar().size(); j++) {
				person.getDemirbaslar().get(j).setPerson(null);
				session.save(person);
			}
		}
		
		session.remove(person);
		
		session.getTransaction().commit();
		System.out.println("Personel silindi.");
	}
	
	public void addDemirbas() {
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		System.out.println("Demirbas Bilgilerini Giriniz");
		System.out.print("Adý: ");
		String adi = in.next();
		System.out.print("Tipi: ");
		String tipi = in.next();
		
		Demirbas demirbas = new Demirbas(adi, tipi);
		session.save(demirbas);
		
		session.getTransaction().commit();
		System.out.println("Demirbas eklendi.");
	}
	
	public void removeDemirbas() {
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		List<Demirbas> demirbasList = getListFromDB(d);
		printList(demirbasList);
		
		System.out.println("Silmek istediginiz Demirbasin numarasýný giriniz: ");
		int i = in.nextInt();
	
		int id = demirbasList.get(i-1).getId();

		Demirbas demirbas = session.get(Demirbas.class, id);
		session.remove(demirbas);
		
		session.getTransaction().commit();
		System.out.println("Demirbas silindi.");
	}
	
	public void registerDemirbas() {
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		List<Person> personList = getListFromDB(p);
		List<Demirbas> demirbasList = getListFromDB(d);
		
		printList(personList);
		System.out.println("Listeden Personel seciniz: ");
		int i = in.nextInt();
		int personId = personList.get(i-1).getId();
		
		Person person = session.get(Person.class, personId);
		System.out.println("Personel secildi.");
		
		printList(demirbasList);
		System.out.println("Listeden Demirbas seciniz: ");
		int j = in.nextInt();
		int demirbasId = demirbasList.get(j-1).getId();
		
		Demirbas demirbas = session.get(Demirbas.class, demirbasId);
		System.out.println(demirbas.getId() + " nolu Demirbas secildi.");
		
		if (demirbas.getPerson() != null) {
			System.out.println("Bu demirbas baska bir personele zimmetli.");
			System.out.println("(1) Secilen personele zimmetle");
			System.out.println("(2) Farklý demirbas sec");
			System.out.println("(3) Bir ust menuye don");
			System.out.print("Seciminiz: ");
			int k = in.nextInt();
			do {
				if (k == 1) {
					demirbas.setPerson(person);
					person.addDemirbas(demirbas);
					session.save(demirbas);
				} else if (k == 2) {
					printList(demirbasList);
					System.out.println("Listeden Demirbas seciniz: ");
					int l = in.nextInt();
					demirbasId = demirbasList.get(l-1).getId();
					demirbas = session.get(Demirbas.class, demirbasId);
					System.out.println(demirbas.getId() + " nolu Demirbas secildi.");
				
					demirbas.setPerson(person);
					person.addDemirbas(demirbas);
					session.save(demirbas);
				}

			} while (k != 3);
		} else {
			demirbas.setPerson(person);
			person.addDemirbas(demirbas);
			session.save(demirbas);
			
			String fullName = person.getFirstName() + " " + person.getLastName(); 
			System.out.println("Demirbas " + fullName + " personeline zimmetlendi.");
		}
		
		session.getTransaction().commit();
	}
	
	public void giveBackDemirbas() {
		session = factory.getCurrentSession();
		session.beginTransaction();

		List<Person> personList = getListFromDB(p);
		
		System.out.println("Tum zimmetleri iade etmek istiyor musunuz? (Y/N): ");
		String input = in.next();
		
		if (input.equalsIgnoreCase("Y")) {
			for (Person person : personList) {
				person = session.get(Person.class, person.getId());
				for (int i = 0; i < person.getDemirbaslar().size(); i++) {
					person.getDemirbaslar().get(i).setPerson(null);
					session.save(person);
				}
			}
			session.getTransaction().commit();
			System.out.println("Tum zimmetler iade edildi.");
		} else System.out.println("Islem iptal edildi.");
	}
	
	public void firePerson() {
		session = factory.getCurrentSession();
		session.beginTransaction();
			
		List<Person> personList = getListFromDB(p);		
		printList(personList);
		
		System.out.print("Isten cikaricak personeli seciniz: ");
		int i = in.nextInt();
		int personId = personList.get(i-1).getId();
		
		Person person = session.get(Person.class, personId);

		if (person.getDemirbaslar() != null) {
			for (int j = 0; j < person.getDemirbaslar().size(); j++) {
				person.getDemirbaslar().get(j).setPerson(null);
				session.save(person);
			}
		}
		
		session.remove(person);
		System.out.println("Personel isten cikarildi.");
		session.getTransaction().commit();
	}
	
	public void printIDCard() {
		session = factory.getCurrentSession();
		session.beginTransaction();
			
		List<Person> personList = getListFromDB(p);		
		printList(personList);
		
		System.out.print("Listeden personel seciniz: ");
		int i = in.nextInt();
		int personId = personList.get(i-1).getId();
		
		Person person = session.get(Person.class, personId);
		
		List<Demirbas> list = person.getDemirbaslar(); 

		System.out.println("Personel Kimlik Bilgileri");
		System.out.println("Adi : " + person.getFirstName().substring(0, 1).toUpperCase() + person.getFirstName().substring(1));
		System.out.println("Soyadi : " + person.getLastName().substring(0, 1).toUpperCase() + person.getLastName().substring(1));
		System.out.println("Telefon : " + person.getTelNo());
		System.out.println("Email : " + person.getEmail());
		System.out.println("Adres : " + person.getAddress());
		if (list == null) {
			System.out.println("Zimmetler : Personele kayitli zimmet bulunmamaktadir.");
		} else {
			System.out.print("Zimmetler : ");
			for (Demirbas demirbas : list) {
				System.out.print(demirbas + ", ");
			}
		}
		
		session.getTransaction().commit();
	}
	
	public <E> void printList(List<E> list) {
		System.out.println("\nListe");
		int i = 1;
		for (E e : list) {
			System.out.println(i + "- " + e);
			i++;
		}
	}
	
	public <E> List<E> getListFromDB(E e) {
		@SuppressWarnings("unchecked")
		List<E> list = session.createQuery("SELECT e "
				+ "FROM " + e.getClass().getName() + " e").getResultList(); 

		return list;
	}
	
	
	
//
}
