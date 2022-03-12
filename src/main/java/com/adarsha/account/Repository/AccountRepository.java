package com.adarsha.account.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adarsha.account.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByCustamerid(long custamerid);

}
