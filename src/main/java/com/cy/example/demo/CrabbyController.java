package com.cy.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrabbyController {
    @RequestMapping("/")
    public String list() {
        return "crabbypage";
    }
}
