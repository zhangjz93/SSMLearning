package cn.zjz.controller;

import cn.zjz.model.User;
import cn.zjz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(ModelMap mm) {
        mm.addAttribute("message", "lslsls");
        return "test";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertUser(ModelMap mm) {
        User u = new User();
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        u.setUserId(id);
        u.setName("Tommy");
        u.setJob("common user");
        userService.insertUser(u);
        mm.addAttribute("message", "已经插入一条数据");
        return "test";
    }

    @RequestMapping(value = "/ftlTest", method = RequestMethod.GET)
    public String ftlTest(ModelMap m) {
        User user = userService.getUserById("7ae034dd7eaa442bbf7241ce9ab6f575");
        m.addAttribute("user", user);
        return "test";
    }

}
