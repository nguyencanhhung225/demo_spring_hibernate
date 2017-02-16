package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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

		} catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			return false;
		} finally {
			session.close();
		}

		return true;
	}

	@Override
	public Account getById(int id) {
		Session session = sessionFactory.openSession();
		Account account = null;

		try {

			account = (Account) session.load(Account.class, new Integer(id));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return account;
	}

	@Override
	public boolean delete(int id) {
		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();

			Account account = (Account) session.load(Account.class, new Integer(id));

			session.delete(account);

			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			return false;
		} finally {
			session.close();
		}

		return true;

	}

	@Override
	public boolean update(Account account) {
		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			session.update(account);

			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			return false;

		} finally {
			session.close();
		}

		return true;
	}

}
