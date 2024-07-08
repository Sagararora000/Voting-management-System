package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity_classes.UserModel;
import entity_classes.VoterModel;



public class UserDao {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vote_management_system");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
	
	public boolean AdminValidate(String name, String password) {
		UserModel user = em.find(UserModel.class, 1);
		System.out.println(name);
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(password);
//		System.out.println(user.getU_id());
		if(name.equals(user.getName()) && password.equals(user.getPassword())) {
			
			return true;
		}
//		return false;
		return false;
	}
	public List<UserModel> viewAll() {
		Query query = em.createQuery("select u from UserModel u");
		List<UserModel>users = query.getResultList();
		
		return users;
		
		
	}
	public boolean add_users_method(int id,int age,String name,String password) {
		
		UserModel user1 = new UserModel(id,name,age,password,null);
		et.begin();
			em.persist(user1);
		et.commit();
		return true;
		
	}
	public boolean remove(int id) {
		UserModel user = em.find(UserModel.class, id);
		VoterModel voter = em.find(VoterModel.class, id);
		if(user.getVoter() == null){
			et.begin();
			  em.remove(user);
			 
			et.commit();
		}
		else if(user.getVoter() != null){
			user.setVoter(null);
			et.begin();
				em.remove(voter);
				
			et.commit();
		}
		
		return true;
	}
	public boolean addUpdateVoter(int id,String name,String address,int age,String gender,String f_name,String m_name) {
		
		VoterModel voter = new VoterModel(id,name,address,age,gender,f_name,m_name);
		UserModel user1 = em.find(UserModel.class, id);
		user1.setVoter(voter);
		System.out.println(user1);
		System.out.println(voter);
		et.begin();
			em.persist(voter);
			
			
			
			em.merge(user1);
			
		et.commit();
		
		return true;
	}
	public static void main(String[] args) {
		
		
//		UserModel admin = new UserModel(1,"admin",23,"abc",null);
		
//		et.begin();
//			em.persist(um);
//		et.commit();
		
		
		
		
		
	}
}
