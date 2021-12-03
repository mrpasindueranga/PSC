package com.psc.psc_management.Controllers;

import java.util.List;
// import java.util.Objects;

import com.psc.psc_management.Models.Employees;
import com.psc.psc_management.Services.BranchService;
// import com.psc.psc_management.Services.EmployeeNotFoundException;
// import com.psc.psc_management.Services.EmployeeNotFoundException;
import com.psc.psc_management.Services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/employees/update")
    public String update() {
        return "Views/Employees/update";
    }

    // @GetMapping("employees/edit/{id}")
    // public String editEmployee(@PathVariable("id") Integer id, Model model,
    // RedirectAttributes message) {
    // try {
    // Employees employees = employeeService.getEmployees(id);

    // return "redirect:/manager/employees";

    // // if (Objects.equals(editBranch, actualBranch)) {
    // // model.addAttribute("employee", employee);
    // // return "Manager/Views/employee-edit";
    // // } else {
    // // message.addFlashAttribute("error",
    // // "The Employee could not be edited : It either does not exist or you do not
    // // have access to that Employee");
    // // return "redirect:/manager/employees";
    // // }

    // } catch (EmployeeNotFoundException e) {
    // e.printStackTrace();
    // message.addFlashAttribute("error",
    // "The Employee could not be edited : It either does not exist or you do not
    // have access to that Employee");
    // return "redirect:/manager/employees";
    // }
    // }

}
