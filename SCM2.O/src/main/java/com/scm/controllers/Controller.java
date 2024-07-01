package com.scm.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@RestController
@CrossOrigin
public class Controller {


    @GetMapping("/scm")
    public String home()
    {
        System.out.println("IN CONTROLLER");
        return "home";
    }


}
