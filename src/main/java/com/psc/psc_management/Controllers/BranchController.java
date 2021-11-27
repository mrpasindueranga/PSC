package com.psc.psc_management.Controllers;

import java.util.List;

import com.psc.psc_management.Models.Branches;
import com.psc.psc_management.Services.BranchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BranchController {
    @Autowired
    private BranchService branchService;

    @GetMapping("/branches")
    public String index(Model model) {
        List<Branches> branches = branchService.getAll();
        model.addAttribute("branches", branches);
        return "Views/Branch/index";
    }

    @GetMapping("/branches/create")
    public String create(Model model) {
        model.addAttribute("branch", new Branches());
        return "Views/Branch/create";
    }

    @PostMapping("/branches/save")
    public String save(Branches branch, RedirectAttributes message) {
        branchService.save(branch);
        return "Views/Branch/index";
    }

    @GetMapping("/branches/update")
    public String update() {
        return "Views/Branch/update";
    }
}
