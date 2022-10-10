package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//Sadece DB erişim kodları buraya yazılır... SQL
		System.out.print("JDBC ile veritabanına eklendi!");
		
	}
}

//