package com.psc.psc_management.Controllers;

import java.util.List;

import com.psc.psc_management.Models.Farmers;
import com.psc.psc_management.Services.BranchService;
import com.psc.psc_management.Services.FarmerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FarmerController {
    @Autowired
    private FarmerService farmerService;
    @Autowired
    private BranchService branchService;

    @GetMapping("/farmers")
    public String index(Model model) {
        List<Farmers> farmers = farmerService.getAll();
        model.addAttribute("farmers", farmers);
        return "Views/Farmers/index";
    }

    @GetMapping("/farmers/create")
    public String create(Model model) {
        model.addAttribute("farmer", new Farmers());
        model.addAttribute("branches", branchService.getAll());
        return "Views/Farmers/create";
    }

    @PostMapping("/farmers/save")
    public String save(Farmers farmer) {
        farmerService.save(farmer);
        return "/Views/Farmers/index";
    }

    @GetMapping("/farmers/update")
    public String update() {
        return "Views/Farmers/update";
    }

}
