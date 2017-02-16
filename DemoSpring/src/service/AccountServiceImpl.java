package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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

}
