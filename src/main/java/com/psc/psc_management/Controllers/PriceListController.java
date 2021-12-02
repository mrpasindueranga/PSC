package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceListController {
    @GetMapping("/paddy")
    public String index() {
        return "Views/Paddy/index";
    }

    @GetMapping("/paddy/create")
    public String create() {
        return "Views/Paddy/create";
    }

    @GetMapping("/paddy/update")
    public String update() {
        return "Views/Paddy/update";
    }
}
