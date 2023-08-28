package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Account;
import com.bank.repository.AccountRepository;

@Repository
public class AccountDao {
	@Autowired
	AccountRepository ar;

	public String setAcc(Account acc) {
		ar.save(acc);
		return "Saved";
	}

	public String setAllAcc(List<Account> accs) {
		ar.saveAll(accs);
		return "Saved All";
	}

	public List<Account> getAllAcc() {
		return ar.findAll();
	}

	public Account getById(int id) {
		return ar.findById(id).get();
	}

	public Account getByAcNo(long no) {
		return ar.getByAcNo(no);
	}

	public Account getMax() {
		return ar.getMax();
	}

	public Account getMin() {
		return ar.getMin();
	}

}
