package com.guang.controller;

import com.guang.admin.api.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualService scheduledService;

    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    public String sayHi() {
        return scheduledService.sayHI();
    }
}
