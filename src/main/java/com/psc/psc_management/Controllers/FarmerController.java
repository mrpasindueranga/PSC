package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FarmerController {
    @GetMapping("/farmers")
    public String index() {
        return "Views/Farmers/index";
    }

    @GetMapping("/farmers/create")
    public String create() {
        return "Views/Farmers/create";
    }

    @GetMapping("/farmers/update")
    public String update() {
        return "Views/Farmers/update";
    }

}
