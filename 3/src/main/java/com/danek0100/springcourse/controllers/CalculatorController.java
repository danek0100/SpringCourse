package com.danek0100.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("/calc")
    public String calc(@RequestParam(value = "action") String action,
                       @RequestParam(value = "a") Integer a,
                       @RequestParam(value = "b") Integer b,
                       Model model) {
        if (action.equals("multiplication"))
            model.addAttribute("result", a*b);
        if (action.equals("addition"))
            model.addAttribute("result", a+b);
        if (action.equals("subtraction"))
            model.addAttribute("result", a-b);
        if (action.equals("division"))
            model.addAttribute("result", a/b);
        return "/calculator/calc";
    }
}
