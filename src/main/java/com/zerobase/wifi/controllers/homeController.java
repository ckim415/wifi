package com.zerobase.wifi.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class homeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home(Model model) {
        return "home.html";
    }
    @RequestMapping(value="/load_wifi")
    public String open_api(Model model)  {
        model.addAttribute("msg", "개의 WIFI정보를 정상적으로 저장하였습니다.");
        return "load_wifi.html";
    }
}
