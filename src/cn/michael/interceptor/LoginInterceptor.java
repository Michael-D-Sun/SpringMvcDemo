package cn.michael.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class LoginInterceptor implements HandlerInterceptor {
    private List<String> allowedPass;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-----------------Before Handler------------");
        String url =  request.getRequestURL().toString();
        Object user = request.getSession().getAttribute("user");
        if(user != null){
            return true;
        }
        for(String str:allowedPass){
            if(url.endsWith(str)){
                return true;
            }
        }
        response.sendRedirect(request.getContextPath()+"/login.jsp");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    public List<String> getAllowedPass() {
        return allowedPass;
    }

    public void setAllowedPass(List<String> allowedPass) {
        this.allowedPass = allowedPass;
    }
}
