package com.example.springhtml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {


    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("name", new Name());
        return "index";
    }

    @PostMapping("/success")
    public String greet(Name name, Model model) {
        model.addAttribute("message", "Hello, " + name.getName() + "!");
        return "success";
    }

}



