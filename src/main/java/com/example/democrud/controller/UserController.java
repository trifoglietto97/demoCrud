package com.example.democrud.controller;

import com.example.democrud.entity.User;
import com.example.democrud.repository.UserRepository;
import com.example.democrud.service.UserService;
import jakarta.jws.soap.SOAPBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/saveAllUser",method = RequestMethod.POST)
    private List<User> saveAll(@RequestBody List<User> userList){
        return userService.saveUser(userList);
    }

    @GetMapping(value = "/findById/{id}")
    private User findById(@PathVariable Long id){
       return  userService.finById(id);
    }

    @GetMapping(value = "/getAll")
    private List<User> getAll(){
        return userService.getAllUser();
    }

    @GetMapping(value = "/findByUsername/{username}")
    private User findByUsername(@PathVariable String username){
        return  userService.findByUsername(username);
    }


    @DeleteMapping(value = "/deleteById/{id}")
    private void deleteById(@PathVariable Long id){
         userService.deleteById(id);
    }

    @RequestMapping(value = "/paginAndSort/{pageNumber}/{pageSize}", method = RequestMethod.GET)
    public Page<User> usserPagination(@PathVariable Integer pageNumber, @PathVariable Integer pageSize){
        return userService.getUserPagination(pageNumber, pageSize);
    }



}
