package com.vaibhav.springboot.bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhav.springboot.bank.Account.Account;

public interface BankRepository extends JpaRepository<Account, Integer>{

}
