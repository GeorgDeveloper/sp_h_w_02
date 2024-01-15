package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/")
    public String users(Model model){
        model.addAttribute("users", userService.userList());
        return "index";
    }

    @PostMapping("/index/create")
    public String addUsers(User user){
        userService.addUser(user);
        return "redirect:/";
    }

    @PostMapping("/index/update")
    public String updateUsers(User user){
        userService.updateUser(user);
        return "redirect:/";
    }

    @PostMapping("/index/delete/")
    public String delUsers(int id){
        userService.delUser(id - 1);
        return "redirect:/";
    }
}
