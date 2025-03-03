package com.pbl5cnpm.airbnb_service.controller.guest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/guest")

public class Home {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello!";
    }
}
