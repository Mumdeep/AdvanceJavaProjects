package com.SpringBoot.Mum.Banking_App.repository;

import com.SpringBoot.Mum.Banking_App.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
