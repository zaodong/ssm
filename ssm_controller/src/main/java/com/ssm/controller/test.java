package com.ssm.controller;

import com.ssm.service.Testservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class test {
    @Resource
    private Testservice testservice;
    @RequestMapping("/test")
    public  void getMethod(){
        testservice.add();
            System.out.println("这是controlller");
        }
}
