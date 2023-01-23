package com.example.griffin_airlines.controller;

import com.example.griffin_airlines.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    DBService dbs;

    @Autowired
    public FlightController(DBService dbs) {
        this.dbs = dbs;
    }

    @GetMapping("/search_ticket")
    public String search_ticket(@RequestParam(value = "beginning") String f_beginning
            , @RequestParam(value = "destination") String f_destination
            , @RequestParam(value = "datee") String f_date) {

        System.out.println(f_beginning);
        return dbs.selectFlight(f_beginning,f_destination,f_date);
    }

}
