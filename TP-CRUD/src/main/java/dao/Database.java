package dao;

import java.util.ArrayList;

import entity.User;

public class Database {
	public static ArrayList<User> users = new ArrayList<User>() {
		{
			add(new User(1, 24, "Marina", "marina.garin21@gmail.com", "ferhgzhf", 7));
			add(new User(2, 24, "Brice", "brice.vssl@gmail.com", "baodboz", 14));
			add(new User(3, 25, "Yoann", "yo.zamora@gmail.com", "zebgbzibfa", 5));
			add(new User(4, 28, "Juliana", "jugnagna@yahoo.fr", "ezvnZP", 1));
			add(new User(5, 30, "Maxime", "edouard.serpentard@gmail.com", "stefufhz", 11));
		}
		
	};

}
