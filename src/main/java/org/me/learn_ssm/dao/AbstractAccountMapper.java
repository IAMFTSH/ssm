package org.me.learn_ssm.dao;

import org.me.learn_ssm.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbstractAccountMapper {
    List<Account> accountList();  /*List应该放前面*/
    int setAccount(Account account);
}
