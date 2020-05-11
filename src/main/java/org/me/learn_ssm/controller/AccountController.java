package org.me.learn_ssm.controller;

import org.me.learn_ssm.dao.AbstractAccountMapper;
import org.me.learn_ssm.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AccountController {
    private AccountServiceImpl accountService;
    private AbstractAccountMapper AbstractAccountMapper;

    @RequestMapping("test")
    public String test() {
        accountService.test();
        AbstractAccountMapper.accountList();
        System.out.println(AbstractAccountMapper.accountList());
        return "success";
    }


    /*    ！！！！！！！
        这里三使用xml容器中的bean注入的，不是注解方法注入的，两个容器的bean不是同一个对象*/
    @Autowired
    public void setAccountService(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }
    @Autowired
    public void setAbstractAccountMapper(AbstractAccountMapper abstractAccountMapper) {
        AbstractAccountMapper = abstractAccountMapper;
    }
}
