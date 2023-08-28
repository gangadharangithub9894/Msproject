package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query(value = "select * from account_details where ac_no like ?", nativeQuery = true)
	Account getByAcNo(long no);

	@Query(value = "select * from account_details order by available_balance desc limit 1", nativeQuery = true)
	Account getMax();

	@Query(value = "select * from account_details order by available_balance limit 1", nativeQuery = true)
	Account getMin();

}
