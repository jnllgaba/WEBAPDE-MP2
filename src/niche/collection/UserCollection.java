package niche.collection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import niche.bean.User;

public class UserCollection 
{
	
/******************        USERS TABLE METHODS        ******************/	
	
	public static List<User> getAllUsers() 
	{
		List<User> users = new ArrayList<User>();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			TypedQuery<User> q = em.createQuery("FROM users", User.class);
			users = q.getResultList();
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return users;
	}
	
	public static boolean addUser(User u) 
	{
		boolean added = false;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.persist(u);
			
			trans.commit();
			added = true;
		} catch(Exception e) {
			if(trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return added;
	}

	public static boolean updateUser(int id, User newinfo)
	{
		boolean updated = false;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			
			User u = em.find(User.class, id);
			
			u.setUsername(newinfo.getUsername());
			u.setPassword(newinfo.getPassword());
			u.setDescription(newinfo.getDescription());
			
			trans.commit();
			updated = true;
		} catch(Exception e) {
			if(trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return updated;
	}
	
	public static boolean deleteUser(int id)
	{
		boolean deleted = false;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			
			User u = em.find(User.class, id);
			
			em.remove(u);
			trans.commit();
			deleted = true;
		} catch(Exception e) {
			if(trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return deleted;
	}
	
	public static User getUser(int id)
	{
		User u = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			
			u = em.find(User.class, id);
			
			trans.commit();
			
		} catch(Exception e) {
			if(trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return u;
	}
	
	public static void main (String[] args) {
		
		List<User> users = getAllUsers();
		for(User u: users)
		{
			System.out.println(u.toString());
		}
	}
}
