package cn.michael.controller;

import cn.michael.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        if("siggy".equals(user.getName()) && "123".equals(user.getPassword())){
            session.setAttribute("user", user);
            System.out.println("Congrats: Login successfully.");
            return "redirect:/index.jsp";
        }
        return "redirect:/login.jsp";
    }
}
