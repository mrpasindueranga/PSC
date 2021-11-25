package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IssuePaddy {
    @GetMapping("/issuepaddy")
    public String index() {
        return "Views/Issuepaddy/index";
    }

    @GetMapping("/issuepaddy/create")
    public String create() {
        return "Views/Issuepaddy/create";
    }

    @GetMapping("/issuepaddy/update")
    public String update() {
        return "Views/Issuepaddy/update";
    }
}
