package com.demo.boot.spring.demo.controller;

import com.demo.boot.spring.demo.configuration.Courseconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckConfigController {
    @Autowired
    public Courseconfig courseconfig;
    @RequestMapping("config")
    public Courseconfig m1(){
        return  courseconfig;
    }
}
