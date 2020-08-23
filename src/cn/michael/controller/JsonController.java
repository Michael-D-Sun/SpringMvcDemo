package cn.michael.controller;

import cn.michael.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JsonController {
     @RequestMapping("/json")
     @ResponseBody
    public List<User> json(){
         List<User> users = new ArrayList<User>();
         users.add(new User(1, "ZhangSan", "Male"));
         users.add(new User(2, "LiSi", "Male"));

         return users;
     }
}
