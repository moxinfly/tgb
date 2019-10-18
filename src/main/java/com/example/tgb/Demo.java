package com.example.tgb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        return "spring-security demo";
    }
}
