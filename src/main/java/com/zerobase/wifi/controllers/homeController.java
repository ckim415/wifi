package com.zerobase.wifi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String home() {
        return "home.html";
    }

    @RequestMapping("/load_wifi")
    public String open_api(Model model)  {
        model.addAttribute("msg", "개의 WIFI정보를 정상적으로 저장하였습니다.");
        return "load_wifi.html";
    }
}
