package com.xworkz.tv.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TvChannelDAOImpl implements TvChannelDAO {

		@Override
	public void saveChannel(TVchennel tvChannel) {
			EntityManagerFactory factory =null;
			EntityManager entitymaneger = null;
			EntityTransaction tx = null;
			 try {
				 factory =Persistence.createEntityManagerFactory("tv");
				 entitymaneger = factory.createEntityManager();
				 tx =entitymaneger.getTransaction();
				 tx.begin();
				 entitymaneger.persist(tvChannel);
				 tx.commit();
			 }catch(Exception e) {
				 tx.rollback();
				 e.printStackTrace();
				 
			 }finally {
				 if(entitymaneger!=null) {
					 
				 
				 entitymaneger.close();
				 
				 }
				 
			 }
		
	}
}
