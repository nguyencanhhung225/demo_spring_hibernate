package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public List<Category> getAll() {
		Session session = sessionFactory.openSession();

		Transaction transaction = null;

		List<Category> list = null;
		
		try {
			transaction = session.beginTransaction();

			list = session.createQuery("FROM Category").list();

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

}
