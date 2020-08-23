package cn.michael.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class AjaxController {
    @RequestMapping("/ajax")
    public void ajax(String name, HttpServletResponse resp) throws IOException {
        if("siggy".equals(name)){
            resp.getWriter().println("true");
        }
        else{
            resp.getWriter().println("false");
        }
    }

}
