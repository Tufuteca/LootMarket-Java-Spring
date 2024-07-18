package com.edokandoe.tufuteca.LootMarket.controller;

import com.edokandoe.tufuteca.LootMarket.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/authorization")
    public String getAuthPage() {
        return "authorization";
    }

    @GetMapping("/privacy-policy")
    public String getPrivacyPolicyPage() {
        return "privacy-policy";
    }

    @GetMapping("/cookie-policy")
    public String getCookiePolicyPage() {
        return "cookie-policy";
    }

    @GetMapping("/agreement")
    public String getAgreementPage() {
        return "agreement";
    }

    @GetMapping("/sale-terms")
    public String getSaleTermsPage() {
        return "sale-terms";
    }

    @GetMapping("/dashboard")
    public String getDashboard() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        var userOptional = usersService.findByLogin(authentication.getName());

        if (userOptional.isPresent()) {
            var user = userOptional.get();
            Long roleId = user.getRole().getId();

            if (roleId != null) {
                switch (roleId.intValue()) {
                    case 1:
                        return "redirect:/admin-profile";
                    case 2:
                        return "redirect:/moderator-profile";
                    case 3:
                        return "redirect:/user-profile";
                    default:
                        return "redirect:/authorization";
                }
            } else {
                return "redirect:/authorization";
            }
        } else {
            return "redirect:/authorization";
        }
    }
}
