package cn.michael.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello Controller");
        return "/index.jsp";
    }
}
