package edu.just.jiguo.controller;

import edu.just.jiguo.model.User;
import edu.just.jiguo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public User login(User user){
        User user1 = userService.login(user);
        return user1;
    }

    @RequestMapping("/reg")
    public String regUser(User user){
        boolean flag = userService.addUser(user);
        if (flag){
            return "1";
        }

        return "0";
    }
}
