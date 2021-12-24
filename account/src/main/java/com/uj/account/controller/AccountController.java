package com.uj.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uj.account.entity.Account;
import com.uj.account.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/addAccount")
	public Account addAccount(@RequestBody Account account) {
		return accountService.addAccount(account);
	}

	@PutMapping("/updateAccount")
	public Account updateAccount(@RequestBody Account account) {
		return accountService.addAccount(account);
	}

	@DeleteMapping("/removeAccount/{accountId}")
	public String removeAccount(@PathVariable Integer accountId) {
		return accountService.deleteAccount(accountId);
	}

	@GetMapping("/getAllAccounts")
	public List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	@GetMapping("/getAccount/{accountId}")
	public Account getAccountByAccountId(@PathVariable Integer accountId) {
		return accountService.getAccountByAccountId(accountId);
	}

}
