package com.s3.com.demo.api;


import com.s3.com.demo.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("WellsFargo")
public class Controller {
/*
    @GetMapping("/startingBalance")
    public int getStartingBalance() {
    return;
    }
*/

    @PostMapping("/deposit")
    public int totalBalancewithDeposit(@RequestBody Account account) {
        return account.getInitialBalance() + account.getDeposit();
    }

}
