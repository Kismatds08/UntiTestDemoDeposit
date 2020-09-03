package com.s3.com.demo;


import com.s3.com.demo.api.Controller;
import com.s3.com.demo.model.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDepositController {
    @Autowired
    Controller controller;

    @Test
    public void TesttotalBalancewithDeposit(){
        Account account = new Account();
        account.setInitialBalance(600);
        account.setDeposit(400);
        int expected = 1000;
        int actual = controller.totalBalancewithDeposit(account);
        Assertions.assertEquals(expected, actual);
    }
}
