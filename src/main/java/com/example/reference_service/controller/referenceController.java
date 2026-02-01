package com.example.reference_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reference")
public class referenceController {
    @GetMapping("/generate")
    public String generateReference() {
        return "TXN-" + System.currentTimeMillis();
    }
}
