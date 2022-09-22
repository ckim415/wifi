package com.zerobase.wifi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class homeController {

    @RequestMapping("/")
    public String home() {
        return "home.html";
    }

    /*
    @RequestMapping("/wifi")
    public String seoul_wifi() {

    }
    */

}
