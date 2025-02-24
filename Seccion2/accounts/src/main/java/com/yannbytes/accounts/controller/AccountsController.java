package com.yannbytes.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Below annotation is used to mark this class as a controller
@RestController
public class AccountsController {

    //Below annotation is used to mark this method as a rest endpoint
    @GetMapping("sayHello")
    public String sayHello(){
        return "Hello world";
    }
}
