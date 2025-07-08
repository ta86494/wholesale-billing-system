package com.example.billing;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BillingController {

    @GetMapping("/invoice")
    public String generateInvoice(@RequestParam String item, @RequestParam int qty) {
        return "Invoice generated for: " + item + " | Quantity: " + qty;
    }
}
