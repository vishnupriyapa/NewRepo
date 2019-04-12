package com.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.main.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {


@Query(value="select * from account  where registration_id=?1 and account_type=?2",nativeQuery=true)
	Account findByAccountType(int id, String s);
}
