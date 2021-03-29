package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{numOne}/and/{numTwo}")
    @ResponseBody
    public int add(@PathVariable int numOne, @PathVariable int numTwo){
        return numOne + numTwo;
    }




    @GetMapping("/subtract/{numOne}/from/{numTwo}")
    @ResponseBody
    public int subtract(@PathVariable int numOne, @PathVariable int numTwo){
        return numTwo - numOne;
    }



    @GetMapping("/multiply/{numOne}/and/{numTwo}")
    @ResponseBody
    public int product(@PathVariable int numOne, @PathVariable int numTwo){
        return numTwo * numOne;
    }


    @GetMapping("/divide/{numOne}/by/{numTwo}")
    @ResponseBody
    public float divide(@PathVariable float numOne, @PathVariable float numTwo){
        return numOne/numTwo;
    }
}