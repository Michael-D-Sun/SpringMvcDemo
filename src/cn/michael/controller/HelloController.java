package cn.michael.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {
    @RequestMapping("/abc")
    public ModelAndView hello(HttpServletRequest req, HttpServletResponse resp){
        ModelAndView mv = new ModelAndView();

        //capsule the data which will be displayed in the view
        mv.addObject("msg","hello springmvc");

        //view name   web-inf/jsp/hello.jsp
        mv.setViewName("hello");

        return mv;
    }

}
