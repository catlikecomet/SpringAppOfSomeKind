package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.page.UserPageModel;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService;}

    @RequestMapping("")
    ModelAndView root() {
        List<User> allUsers = userService.getAllUsers();
        UserPageModel userPageModel = new UserPageModel();
        userPageModel.setUsers(allUsers);

        return new ModelAndView("user", "model", userPageModel);
    }

//    @GetMapping("/login")
//    public String login(Model model) {
//        return "login";
//    }
//
//    @GetMapping
//    public String userIndex() {
//        return "user/index";
//    }

}
