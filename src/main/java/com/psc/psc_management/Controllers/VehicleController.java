package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {
    @GetMapping("/vehicles")
    public String index() {
        return "Views/Vehicles/index";
    }

    @GetMapping("/vehicles/create")
    public String create() {
        return "Views/Vehicles/create";
    }

    @GetMapping("/vehicles/update")
    public String update() {
        return "Views/Vehicles/update";
    }

}
