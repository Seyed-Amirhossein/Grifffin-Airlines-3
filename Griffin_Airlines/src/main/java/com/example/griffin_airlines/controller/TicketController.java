package com.example.griffin_airlines.controller;


import com.example.griffin_airlines.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    DBService dbs;

    @Autowired
    public TicketController(DBService dbs) {
        this.dbs = dbs;
    }

    @GetMapping("/list_ticket")
    public String list_ticket() {
        return dbs.selectTicket();
    }
}
