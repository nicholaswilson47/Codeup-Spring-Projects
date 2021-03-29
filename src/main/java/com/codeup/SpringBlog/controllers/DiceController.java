package com.codeup.SpringBlog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.ThreadLocalRandom;

@Controller
public class DiceController {

    @GetMapping("/roll-dice/{n}")
    public String showRollDicePage(@PathVariable int n, Model viewModel){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6+1);
        viewModel.addAttribute("isCorrect", randomNum == n);
        viewModel.addAttribute("guess", n);
        viewModel.addAttribute("randomNum", randomNum);
        return"roll-dice";
    }
}
