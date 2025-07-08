package com.example.billing;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @PostMapping("/generate")
    public String generateInvoice(@RequestBody String itemDetails) {
        return "Web Invoice: " + itemDetails + " [Generated]";
    }
}