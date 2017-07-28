package niche.collection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import niche.bean.Allowed;

public class AllowedCollection 
{
/******************        ALLOWED USERS TABLE METHODS        ******************/	
	
	public static List<Allowed> getAllAllowedUsers() {
		List<Allowed> allowedUsers = new ArrayList<Allowed>();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			TypedQuery<Allowed> q = em.createQuery("FROM allowed", Allowed.class);
			allowedUsers = q.getResultList();
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return allowedUsers;
	}
	
	public static boolean addAllowedUser(Allowed a) {
		boolean added = false;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.persist(a);
			
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
	
	public static boolean deleteAllowedUser(Allowed a)
	{
		boolean deleted = false;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			
			List<Allowed> allowedpeeps = new ArrayList<Allowed>(); 
			TypedQuery<Allowed> q = em.createQuery("FROM allowed WHERE photoid = " + a.getPhotoid(), Allowed.class);
			allowedpeeps = q.getResultList();
			
			Allowed obsolete = null;
			for(Allowed aa : allowedpeeps)
			{
				if(aa.getUserid() == a.getUserid()) {
					obsolete = a;
					break;
				}
			}			
			
			em.remove(obsolete);
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
	
	// get all allowed users of a photo
	public static List<Allowed> getAllowedUsers(int id)
	{
		List<Allowed> users = new ArrayList<Allowed>(); 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			
			TypedQuery<Allowed> q = em.createQuery("FROM allowed WHERE photoid = " + id, Allowed.class);
			users = q.getResultList();
			
			trans.commit();
			
		} catch(Exception e) {
			if(trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return users;
	}

}
