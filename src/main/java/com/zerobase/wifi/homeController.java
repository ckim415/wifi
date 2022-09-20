package com.zerobase.wifi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class homeController {

    @GetMapping()
    public String index() {
        return "hello world!";
    }

}
