package com.guang.admin.hystric;

import com.guang.admin.api.SchedualService;
import org.springframework.stereotype.Component;

@Component
public class HiHystric implements SchedualService{

    @Override
    public String sayHI() {
        return "sorry";
    }
}
