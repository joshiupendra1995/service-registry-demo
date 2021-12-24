package com.uj.account.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountId;

	private String accountType;

	private BigDecimal balance;

	public Account() {

	}

	public Account(Integer accountId, String accountType, BigDecimal balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public BigDecimal getBalance() {
		return balance;
	}

}
