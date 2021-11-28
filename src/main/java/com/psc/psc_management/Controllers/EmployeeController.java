package com.psc.psc_management.Controllers;

import java.util.List;

import com.psc.psc_management.Models.Employees;
import com.psc.psc_management.Services.BranchService;
import com.psc.psc_management.Services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private BranchService branchService;

    @GetMapping("/employees")
    public String index(Model model) {
        List<Employees> employees = employeeService.getAll();
        model.addAttribute("employees", employees);
        return "Views/Employees/index";
    }

    @GetMapping("/employees/create")
    public String create(Model model) {
        model.addAttribute("branches", branchService.getAll());
        return "Views/Employees/create";
    }

    @PostMapping("/employees/save")
    public String save(Employees employee) {
        employeeService.save(employee);
        return "/Views/Employees/index";
    }

    @GetMapping("/employees/update")
    public String update() {
        return "Views/Employees/update";
    }

}
