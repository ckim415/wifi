package com.zerobase.wifi.controllers;


import com.zerobase.wifi.model.Loc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class homeController {
    @RequestMapping(value="/")
    public String home(Model model) {
        Loc loc = new Loc();
        String lat = loc.lat;
        String lnt = loc.lnt;
        model.addAttribute("lat",lat);
        model.addAttribute("lnt", lnt);
        return "home.html";
    }
    @RequestMapping(value="/load_wifi")
    public String open_api(Model model)  {
        model.addAttribute("msg", "개의 WIFI정보를 정상적으로 저장하였습니다.");
        return "load_wifi.html";
    }
}
