package service;

import java.util.List;

import dto.Account;

public interface AccountService {
	List<Account> getAll();
	Account getById(int id);
	boolean insert(Account account);
	boolean update(Account account);
	boolean delete(int id);
}
