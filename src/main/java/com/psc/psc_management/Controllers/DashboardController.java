package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("/")
    public String index() {
        return "Views/Dashboard/index";
    }
}
