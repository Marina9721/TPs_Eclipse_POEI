package services;

import java.util.ArrayList;

import dao.Database;
import entity.Product;

public class ProductService {
	
	public void createProduct(Product p) {
		Database.stock.add(p);
	}
	
	public Product getProductById(int id) {
		for(Product p : Database.stock) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}
	
	public ArrayList<Product> getAllProduct() {
		return Database.stock;
	}
	
	public void updateProduct(Product p) {
		for(Product product : Database.stock) {
			if(p.getId() == product.getId()) {
				product.setBrand(p.getBrand());
				product.setDescription(p.getDescription());
				product.setName(p.getName());
				product.setPrice(p.getPrice());
				break;
			}
		}
	}
	
	public void deleteProduct(int id) {
		for(Product p : Database.stock) {
			if(p.getId() == id) {
				Database.stock.remove(p);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		System.out.println("Tous mes produits : " + service.getAllProduct());
		
		Product p = new Product(5, "Telephone", "lalala", 225, "Samsung");
		service.createProduct(p);
		System.out.println("New product : " + p);
		System.out.println("Add product to db : " + service.getAllProduct());
		
		service.deleteProduct(1);
		System.out.println("Remove product from db : " + service.getAllProduct());
		
	}

}
