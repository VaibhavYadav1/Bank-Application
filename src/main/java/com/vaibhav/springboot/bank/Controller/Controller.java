package com.vaibhav.springboot.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.springboot.bank.Account.Account;
import com.vaibhav.springboot.bank.Repository.BankRepository;

@RestController
public class Controller {
	
	@Autowired
	BankRepository repo;
	
	// Post 
	@RequestMapping(value="/account/" ,method=RequestMethod.GET)
	public List<Account> findAll(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/account/{id}" , method=RequestMethod.GET)
	public Account findProduct(@PathVariable("id")int id) {
		return repo.findById(id).get();
	}
	
	@RequestMapping(value="/account/" , method=RequestMethod.POST)
	public Account createProduct(@RequestBody Account account) {
		return repo.save(account);
	}
	
	@RequestMapping(value="/account/" , method=RequestMethod.PUT)
	public Account updateProduct(@RequestBody Account account) {
		return repo.save(account);
	}	
	
	@RequestMapping(value="/account/{id}" , method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		repo.deleteById(id);
	}
}