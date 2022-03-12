package com.adarsha.account.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adarsha.account.Repository.AccountRepository;
import com.adarsha.account.model.Account;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repo;

	public Account addacount(Account account) {
		Account saveaccount = repo.save(account);
		return saveaccount;
	}

	public Account findByCustamerid(long custamerid) {
		Account account = repo.findByCustamerid(custamerid);
		return account;
	}
}
