package com.psc.psc_management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryController {
    @GetMapping("/inventory/paddyrequest")
    public String index1() {
        return "Views/Inventory/issuerequest";
    }

    @GetMapping("/inventory/issuedpaddy")
    public String index2() {
        return "Views/Inventory/issued";
    }

    // @GetMapping("/issuepaddy/update")
    // public String update() {
    // return "Views/Issuepaddy/update";
    // }
}
