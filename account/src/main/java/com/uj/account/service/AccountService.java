package com.uj.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uj.account.entity.Account;
import com.uj.account.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account addAccount(Account account) {
		return accountRepository.save(account);
	}

	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	public Account getAccountByAccountId(Integer accountId) {
		Optional<Account> accountOpt = accountRepository.findById(accountId);
		if (accountOpt.isPresent()) {
			return accountOpt.get();
		}
		throw new RuntimeException("No Account found for given account id " + accountId);

	}

	public String deleteAccount(Integer accountId) {
		try {
			accountRepository.deleteById(accountId);
			return "Account Deleted!!";
		} catch (RuntimeException e) {
			return "Account Deletion Failed";
		}
	}
}
