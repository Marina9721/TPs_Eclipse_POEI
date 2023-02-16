package entity;

public class Product {
	private int id;
	private String name;
	private String description;
	private float price;
	private String brand;
	
	public Product(int id, String name, String description, float price, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
	}
	
	public Product(){
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setName() {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
