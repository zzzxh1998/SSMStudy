package cn.itcast.service;

import cn.itcast.domain.Account;
import cn.itcast.domain.Customers;

import java.util.List;

public interface AccountService {

    // 查询所有账户
    public List<Customers> findAll();

    // 保存帐户信息
    public void saveAccount(Account account);

}
