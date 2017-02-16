package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.AccountDAO;
import dao.AccountDAOImpl;
import dto.Account;

public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDAO accountDAO ;
	
	@Override
	public List<Account> getAll() {
		return accountDAO.getAll();
	}

	@Override
	public Account getById(int id) {
		return accountDAO.getById(id);
	}

	@Override
	public boolean insert(Account account) {
		return accountDAO.insert(account);
	}

	@Override
	public boolean delete(int id) {
		return accountDAO.delete(id);
	}

	@Override
	public boolean update(Account account) {
		return false;
	}

}
