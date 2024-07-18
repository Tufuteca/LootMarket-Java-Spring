package com.edokandoe.tufuteca.LootMarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModeratorProfileController {
    @GetMapping("/moderator-profile")
    public String getModeratorProfilePage() {
        return "moderator-profile";
    }
}
