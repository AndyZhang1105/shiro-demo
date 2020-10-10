package com.zz.shirodemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.shirodemo.mapper.AccountMapper;
import com.zz.shirodemo.po.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void test(){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username","user");
        Account account = accountMapper.selectOne(wrapper);
        System.out.println(account);
    }
}