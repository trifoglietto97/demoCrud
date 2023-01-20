package com.example.democrud.controller;

import com.example.democrud.entity.User;
import com.example.democrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/saveAllUser",method = RequestMethod.POST)
    public List<User> saveAll(@RequestBody List<User> userList){
        List<User> rispostas = (List<User>) userService.saveUser(userList);
        return rispostas;
    }
}
