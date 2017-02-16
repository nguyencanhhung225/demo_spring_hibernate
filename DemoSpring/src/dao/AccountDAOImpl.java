package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Account;

public class AccountDAOImpl implements AccountDAO {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	@Override
	public List<Account> getAll() {
		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		List<Account> list = null;
		
		try {
			transaction = session.beginTransaction();

			list = session.createQuery("FROM Account").list();

			transaction.commit();

		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}

		return list;
	}

	@Override
	public boolean insert(Account account) {
		
		Session session = sessionFactory.openSession();

		Transaction transaction = null;
		
		try {
			
			session.beginTransaction();
			
			session.save(account);
			
			transaction.commit();
			
			return true;
			
		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			return false;
		} finally {
			session.close();
		}
	}

	
	
	
}
