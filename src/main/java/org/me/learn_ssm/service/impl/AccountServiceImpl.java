package org.me.learn_ssm.service.impl;

import org.me.learn_ssm.service.BaseAccountService;
import org.springframework.stereotype.Service;

@Service("AccountServiceImpl")
public class AccountServiceImpl implements BaseAccountService {
    public void test() {
        System.out.printf("执行了test方法");
    }
}
