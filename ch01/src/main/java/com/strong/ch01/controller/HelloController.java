package com.strong.ch01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController：返回文本
// @Controller：返回网页
@RestController
public class HelloController {
    // 访问WebAPI，默认访问路径http://localhost:80/
    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }
}
