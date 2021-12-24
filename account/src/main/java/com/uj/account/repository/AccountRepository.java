package com.uj.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uj.account.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
