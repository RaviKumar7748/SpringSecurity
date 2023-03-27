package com.emp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome in SBI Bank";
    }

    @GetMapping("/balance")
    public String welComeBalance() {
        return "your balance is 4000.00";
    }

    @GetMapping("/about")
    public String welcomeToSbi() {
        return "About Welcome ";
    }


}
