package dao;

import java.util.ArrayList;

import entity.Product;

public class Database {
	public static ArrayList<Product> stock = new ArrayList<Product>() {
		{
			add(new Product(1, "Clavier", "Super clavier sans fil", 18, "Dell"));
			add(new Product(2, "Souris", "Souris filaire", 6, "Razer"));
			add(new Product(3, "Ecran", "24'' ", 124, "Samsung"));
			add(new Product(4, "Cendrier", "Cendrier OCB", 4, "OCB"));	
		}
	};
}
