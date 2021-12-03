package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinanceController {
    @GetMapping("/finance/payrequest")
    public String index1() {
        return "Views/Finance/index";
    }

    @GetMapping("/finance/paid")
    public String index2() {
        return "Views/Finance/paid";
    }

    // @GetMapping("/paddy/update")
    // public String update() {
    // return "Views/Paddy/update";
    // }
}
