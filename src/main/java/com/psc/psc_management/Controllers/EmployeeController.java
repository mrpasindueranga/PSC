package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping("/employees")
    public String index() {
        return "Views/Employees/index";
    }

    @GetMapping("/employees/create")
    public String create() {
        return "Views/Employees/create";
    }

    @GetMapping("/employees/update")
    public String update() {
        return "Views/Employees/update";
    }

    @GetMapping("/employees/assign")
    public String assign() {
        return "Views/Employees/assign";
    }
}
