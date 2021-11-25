package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceList {
    @GetMapping("/pricelist")
    public String index() {
        return "Views/Pricelist/index";
    }

    @GetMapping("/pricelist/create")
    public String create() {
        return "Views/Pricelist/create";
    }

    @GetMapping("/pricelist/update")
    public String update() {
        return "Views/Pricelist/update";
    }
}
