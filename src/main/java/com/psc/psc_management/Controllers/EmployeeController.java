package com.psc.psc_management.Controllers;

import java.util.List;

import com.psc.psc_management.Models.Employees;
import com.psc.psc_management.Models.Vehicles;
import com.psc.psc_management.Services.BranchService;
import com.psc.psc_management.Services.EmployeeNotFoundException;
import com.psc.psc_management.Services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        model.addAttribute("employee", new Employees());
        model.addAttribute("branches", branchService.getAll());
        return "Views/Employees/create";
    }

    @PostMapping("/employees/save")
    public String save(Employees employee) {
        employeeService.save(employee);
        return "/Views/Employees/index";
    }

    // @GetMapping("/employees/edit/{id}")
    // public String edit(@PathVariable("id") Integer id, Model model) {
    // try {
    // Employees employee = employeeService.getEmployees(id);
    // model.addAttribute("employee", employee);
    // return "Views/Employees/edit";
    // } catch (EmployeeNotFoundException e) {
    // // TODO: handle exception
    // return "Views/Employees/index";
    // }
    // }
}
