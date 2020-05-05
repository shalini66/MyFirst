package com.capgemini.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.spring.dto.UserBean;
import com.capgemini.spring.exception.LMSException;

@Repository
public class UserDAOImp implements UserDAO {
	@PersistenceUnit
	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;
	int noOfBooks = 0;

	@Override
	public boolean register(UserBean info) {
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			UserBean bean = manager.find(UserBean.class, info.getEmail());
			if (bean == null) {
				System.out.println("Record Saved");
			} else {
				throw new LMSException("User already Exist");
			}
			manager.persist(info);
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		factory.close();
		return false;
	}

	@Override
	public UserBean login(String email, String password) {
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			UserBean bean2 = manager.find(UserBean.class, email);
			bean2.setEmail(email);
			manager.persist(bean2);
			if (bean2.getPassword().equals(password)) {
				return bean2;
			}
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		factory.close();
		return null;
	}

}
