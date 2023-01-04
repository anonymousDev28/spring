package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransactionController {
    @GetMapping("/")
    public String index(){
        return "Transaction-history";
    }
}
