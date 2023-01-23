package com.example.griffin_airlines.controller;

import com.example.griffin_airlines.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {
    DBService dbs;

    @Autowired
    public LoginController(DBService dbs) {
        this.dbs = dbs;
    }

    public void Login(@RequestParam(value = "username") String username
            , @RequestParam(value = "password") String pass) {


    }


}
