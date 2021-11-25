package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    @GetMapping("account")
    public String index() {
        return "Views/Account/index";
    }

    @GetMapping("/account/create")
    public String create() {
        return "Views/Account/create";
    }

    @GetMapping("/account/update")
    public String update() {
        return "Views/Account/update";
    }

}
