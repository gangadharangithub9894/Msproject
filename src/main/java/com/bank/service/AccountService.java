package com.bank.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.AccountDao;
import com.bank.entity.Account;

@Service
public class AccountService {
	@Autowired
	AccountDao ad;

	public String setAcc(Account acc) {
		return ad.setAcc(acc);
	}

	public String setAllAcc(List<Account> accs) {
		return ad.setAllAcc(accs);
	}

	public List<Account> getAllAcc() {
		return ad.getAllAcc();
	}

	public Account getById(int id) {
		return ad.getById(id);
	}

	public List<Account> getAccByName(String n) {
		List<Account> acc=getAllAcc();
		List<Account>y=acc.stream().filter(x->x.getName().equalsIgnoreCase(n)).collect(Collectors.toList());
		return y;
	}

	public Account getByAcNo(long no) {
		return ad.getByAcNo(no);
	}

	public Account getMax() {
		return ad.getMax();
	}

	public Account getMin() {
		
		return ad.getMin();
	}

}
