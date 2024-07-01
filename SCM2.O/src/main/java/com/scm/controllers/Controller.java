package com.scm.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/homes")
    public String home()
    {
        System.out.println("IN CONTROLLER");
return "home";
    }


}
