package com.alpersayin.hibernate.app;

import java.util.List;
import java.util.Scanner;

import com.alpersayin.hibernate.entity.Demirbas;
import com.alpersayin.hibernate.entity.Person;

public class MainApp {
	
	private static Menuler menuler =  new Menuler();
	private static Transactions transactions =  new Transactions();
	private static Scanner in = new Scanner(System.in);
	private static int input;
		
	public static void main(String[] args) {
		
		do {
			menuler.mainMenu();
			input = in.nextInt();
			
			if (input == 1) {
				int secim;
				do {
					menuler.personMenu();
					secim = in.nextInt();
					if (secim == 1) {
						transactions.addPerson();
					} else if (secim == 2) {
						transactions.removePerson();
					} else if (secim == 3) {
						transactions.startSession();
						Person p = new Person();
						List<Person> list = transactions.getListFromDB(p);
						transactions.printList(list);
						transactions.commitSession();
					}
				} while (secim != 4);
			} 
			else if (input == 2) {
				int secim;
				do {
					menuler.zimmetMenu();
					secim = in.nextInt();
					if (secim == 1) {
						transactions.addDemirbas();
					} else if (secim == 2) {
						transactions.removeDemirbas();
					} else if (secim == 3) {
						transactions.registerDemirbas();
					} else if (secim == 4) {
						transactions.giveBackDemirbas();
					} else if (secim == 5) {
						transactions.startSession();
						Demirbas d = new Demirbas();
						List<Demirbas> list = transactions.getListFromDB(d);
						transactions.printList(list);
						transactions.commitSession();
					}
				} while (secim != 6);
			}
			else if (input == 3) {
				transactions.firePerson();
			}
			else if (input == 4) {
				transactions.printIDCard();
			}
			
			
		} while (input != -1); {
			System.out.println("Byss");
		}
		
			

	//	
	}
//
}
