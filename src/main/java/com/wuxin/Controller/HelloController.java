package com.wuxin.Controller;


import com.wuxin.domain.User;
import com.wuxin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2021/3/24 15:21
 */
@Controller
@RequestMapping(path = "/helloController")
public class HelloController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(path = "/getuser")
    public String getuser() {
        System.out.println("看到就成功");
        List<User> users = iUserService.findTYAll();
        for (User user:users){
            System.out.println(user);
        }
        return "success";
    }




    @RequestMapping(path = "/gethello")
    public String gethello() {
        System.out.println("Hello World");
        return "success";
    }

    @RequestMapping(path = "/gethe")
    public ModelAndView gethe(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        ModelAndView modelAndView = new ModelAndView("fail");
        modelAndView.addObject("username", username);
        System.out.println(username);
        System.out.println(password);
        return modelAndView;
    }

    @RequestMapping(path = "/geth")
    public String geth(@RequestBody String body) throws UnsupportedEncodingException {
        System.out.println("输出的值: " + URLDecoder.decode(body,"UTF-8"));
        return "success";

    }

    @RequestMapping(path = "/gethh", produces = {"text/html", "application/json;"})
    public ModelAndView gethh(@RequestBody String body) throws UnsupportedEncodingException {
        ModelAndView modelAndView = new ModelAndView("fail");
        modelAndView.addObject("body", URLDecoder.decode(body,"UTF-8"));
        return modelAndView;
    }
}
