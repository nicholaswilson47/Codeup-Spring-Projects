package com.codeup.SpringBlog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name, Model model) {
        List<String> names = new ArrayList<>();

        names.add("Sam");
        names.add("Dorian");
        names.add("Diego");

        model.addAttribute("aName", name.toUpperCase());
        model.addAttribute("admin", name.equals("fer"));
        model.addAttribute("nameList", names);

        return "hello";
    }
    @GetMapping("/join")
    public String renderform(){
        return "join";
    }
    @PostMapping("/join")
    public String submitForm(
            @RequestParam(name = "cohort") String cohort,
            Model viewModel){
        viewModel.addAttribute("welcomeMessage", "Welcome to" + cohort + "!");
        return "join";
    }

}
