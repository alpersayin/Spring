package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Ders;
import com.alpersayin.hibernate.entity.Ogretmen;
import com.alpersayin.hibernate.entity.OgretmenDetay;

public class HQLOgretmenApp {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ders.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Ogretmen ogretmen = session.get(Ogretmen.class, 3);
		
		/*
		 * Hibernate.initialize(ogretmen.getDersler()); lazyi aþmak için
		 */
		System.out.println("Ogretmen: " + ogretmen);
		System.out.println("Dersler : " + ogretmen.getDersler());
		
		session.getTransaction().commit();
		
		 /*	Eager
		  * Hibernate: select ogretmen0_.id as id1_1_0_, ogretmen0_.adi as adi2_1_0_, ogretmen0_.eposta as eposta3_1_0_, ogretmen0_.ogretmen_detay_id as ogretmen_detay_id5_1_0_, ogretmen0_.soyadi as soyadi4_1_0_, dersler1_.OGRETMEN_ID as OGRETMEN_ID3_0_1_, dersler1_.ID as ID1_0_1_, dersler1_.ID as ID1_0_2_, dersler1_.ADI as ADI2_0_2_, dersler1_.OGRETMEN_ID as OGRETMEN_ID3_0_2_, ogretmende2_.id as id1_2_3_, ogretmende2_.fb_sayfasi as fb_sayfasi2_2_3_, ogretmende2_.hobileri as hobileri3_2_3_, ogretmende2_.uzmanlik as uzmanlik4_2_3_, ogretmende2_.web_sitesi as web_sitesi5_2_3_ from OGRETMEN ogretmen0_ left outer join DERS dersler1_ on ogretmen0_.id=dersler1_.OGRETMEN_ID left outer join OGRETMEN_DETAY ogretmende2_ on ogretmen0_.ogretmen_detay_id=ogretmende2_.id where ogretmen0_.id=?
			Ogretmen: Ogretmen [id=3, adi=Alper, soyadi=Ersayin, eposta=alper@mail, ogretmenDetayId=OgretmenDetay [id=3, uzmanlik=Java, hobileri=sinema, kitap, webSitesi=alpersayin.com, fbSayfasi=fb/alpersayin]]
			Dersler : [Ders [id=1, adi=Java], Ders [id=10, adi=Muzik], Ders [id=11, adi=Sinema], Ders [id=12, adi=Tiyatro]]
			
			Lazy
			Hibernate: select ogretmen0_.id as id1_1_0_, ogretmen0_.adi as adi2_1_0_, ogretmen0_.eposta as eposta3_1_0_, ogretmen0_.ogretmen_detay_id as ogretmen_detay_id5_1_0_, ogretmen0_.soyadi as soyadi4_1_0_, ogretmende1_.id as id1_2_1_, ogretmende1_.fb_sayfasi as fb_sayfasi2_2_1_, ogretmende1_.hobileri as hobileri3_2_1_, ogretmende1_.uzmanlik as uzmanlik4_2_1_, ogretmende1_.web_sitesi as web_sitesi5_2_1_ from OGRETMEN ogretmen0_ left outer join OGRETMEN_DETAY ogretmende1_ on ogretmen0_.ogretmen_detay_id=ogretmende1_.id where ogretmen0_.id=?
			Ogretmen: Ogretmen [id=3, adi=Alper, soyadi=Ersayin, eposta=alper@mail, ogretmenDetayId=OgretmenDetay [id=3, uzmanlik=Java, hobileri=sinema, kitap, webSitesi=alpersayin.com, fbSayfasi=fb/alpersayin]]
			Hibernate: select dersler0_.OGRETMEN_ID as OGRETMEN_ID3_0_0_, dersler0_.ID as ID1_0_0_, dersler0_.ID as ID1_0_1_, dersler0_.ADI as ADI2_0_1_, dersler0_.OGRETMEN_ID as OGRETMEN_ID3_0_1_ from DERS dersler0_ where dersler0_.OGRETMEN_ID=?
			Dersler : [Ders [id=1, adi=Java], Ders [id=10, adi=Muzik], Ders [id=11, adi=Sinema], Ders [id=12, adi=Tiyatro]]
		 */
		
	//	
	}
//
}
