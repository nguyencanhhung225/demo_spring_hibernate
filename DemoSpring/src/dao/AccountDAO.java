package dao;

import java.util.List;

import dto.Account;

public interface AccountDAO {
	List<Account> getAll();
	boolean insert(Account account);
}
