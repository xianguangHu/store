package com.guang.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    public String hi() {
        return "hi,web-admin I am cloud-admin-service";
    }
}
