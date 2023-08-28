package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Account;
import com.bank.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountService as;

	@PostMapping("/setAcc")
	public String setAcc(@RequestBody Account acc) {
		return as.setAcc(acc);
	}

	@PostMapping("/setAllAcc")
	public String setAllAcc(@RequestBody List<Account> accs) {
		return as.setAllAcc(accs);
	}

	@GetMapping("/getAllAcc")
	public List<Account> getAllAcc() {
		return as.getAllAcc();
	}

	@GetMapping("/getById/{id}")
	public Account getById(@PathVariable int id) {
		return as.getById(id);
	}

	@GetMapping("/getAccByName/{n}")
	public List<Account> getAccByName(@PathVariable String n) {
		return as.getAccByName(n);
	}

	@GetMapping("/getByAcNo/{no}")
	public Account getByAcNo(@PathVariable long no) {
		return as.getByAcNo(no);
	}

	@GetMapping("/getMax")
	public Account getMax() {
		return as.getMax();
	}

	@GetMapping("/getMin")
	public Account getMin() {
		return as.getMin();
	}

}
