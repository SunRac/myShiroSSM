package com.myshiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author java_shj
 * @desc 登陸控制器
 * @createTime 2019/11/15 18:05
 **/
@Controller
@RequestMapping("")
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, String name, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name, password);
        try {
            subject.login(usernamePasswordToken);
            Session session = subject.getSession();
            session.setAttribute("subject", subject);
            return "redirect:index";
        } catch (Exception e) {
            model.addAttribute("error", "验证失败");
            return "login";
        }
    }
}
