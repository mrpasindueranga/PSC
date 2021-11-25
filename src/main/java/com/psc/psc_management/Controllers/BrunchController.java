package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BrunchController {
    @GetMapping("/brunches")
    public String index() {
        return "Views/Brunch/index";
    }

    @GetMapping("/brunches/create")
    public String create() {
        return "Views/Brunch/create";
    }

    @GetMapping("/brunches/update")
    public String update() {
        return "Views/Brunch/update";
    }
}
