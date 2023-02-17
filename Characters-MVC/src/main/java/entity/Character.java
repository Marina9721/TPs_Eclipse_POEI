package entity;

public class Character {
	int id;
	String name;
	int level;
	int size;
	String type;
	
	public Character(int id, String name, int level, int size, String type) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.size = size;
		this.type = type;
	}
	
	public Character(String name, int level, int size, String type) {
		super();
		this.name = name;
		this.level = level;
		this.size = size;
		this.type = type;
	}

	public Character() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
