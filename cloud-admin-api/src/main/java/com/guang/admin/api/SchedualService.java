package com.guang.admin.api;


import com.guang.admin.hystric.HiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cloud-admin-service",fallback = HiHystric.class)
public interface SchedualService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHI();
}
