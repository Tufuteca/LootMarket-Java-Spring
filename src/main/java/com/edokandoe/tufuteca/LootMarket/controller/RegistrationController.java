package com.edokandoe.tufuteca.LootMarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RegistrationController {


    @GetMapping("/register")
    public String getRegistrationPage() {
        return "register";
    }

}
