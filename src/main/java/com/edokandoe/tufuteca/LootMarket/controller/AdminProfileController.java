package com.edokandoe.tufuteca.LootMarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminProfileController {
    @GetMapping("/admin-profile")
    public String getAdminProfilePage() {
        return "admin-profile";
    }
}
