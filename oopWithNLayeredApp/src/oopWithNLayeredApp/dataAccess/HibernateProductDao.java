package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		//Sadece DB erişim kodları buraya yazılır... SQL
		System.out.print("Hibernate ile veritabanına eklendi!");
		
	}
}
