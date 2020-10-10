package com.zz.shirodemo.service;

import com.zz.shirodemo.po.Account;

public interface AccountService {
    public Account findByUsername(String username);
}
