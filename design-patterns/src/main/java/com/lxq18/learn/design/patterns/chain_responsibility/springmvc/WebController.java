package com.lxq18.learn.design.patterns.chain_responsibility.springmvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/interceptor")
    public String interceptor(Model model) {
        model.addAttribute("hello", "hello");
        System.out.println("model : " + model);
        return "inderceptor";
    }

    @RequestMapping("/hello/123")
    public String hello(Model model) {
        model.addAttribute("hello", "hello");
        System.out.println("model : " + model);
        return "hello";
    }
}
