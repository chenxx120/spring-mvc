package com.wocloud.controller;

import com.wocloud.entity.User;
import com.wocloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

/**
 *
 * @author xinxin.chen
 * @date 2017/7/1
 */
@Controller
public class HelloController {
    Logger logger = Logger.getLogger("HelloController");

    @Autowired
    private UserService userService;

    @RequestMapping("/xin")
    public String xin(){
        userService.xin();
        logger.info("HelloController.xin()");
        System.out.println("HelloController.xin()");
        return "xin";
    }

    @RequestMapping("/user")
    public ModelAndView user(){
        System.out.println("HelloController.user()");
        User user = userService.findById(1);
        String name = user.getName();
        System.out.println(name);
        logger.info(name);

        ModelAndView mv = new ModelAndView();
        mv.addObject("message","hello.xinxin");
        mv.setViewName("user");
        return mv;
    }

}
