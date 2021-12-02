package com.psc.psc_management.Controllers;

import java.util.List;

import com.psc.psc_management.Models.Vehicles;
import com.psc.psc_management.Services.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicles")
    public String index(Model model) {
        List<Vehicles> vehicles = vehicleService.getAll();
        model.addAttribute("vehicles", vehicles);
        return "Views/Vehicles/index";
    }

    @GetMapping("/vehicles/create")
    public String create(Model model) {
        model.addAttribute("vehicle", new Vehicles());
        return "Views/Vehicles/create";
    }

    @GetMapping("/vehicles/update")
    public String update() {
        return "Views/Vehicles/update";
    }

    @PostMapping("/vehicles/save")
    public String save(Vehicles vehicle) {
        vehicleService.save(vehicle);
        return "Views/Vehicles/index";
    }

}
