package niche.collection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import niche.bean.User;

public class NicheCollection {

	public static void getAllUsers() {
		List<User> users = new ArrayList<User>();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
	}
}
