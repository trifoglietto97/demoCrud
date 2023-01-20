package com.example.democrud.service;

import com.example.democrud.entity.User;
import com.example.democrud.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.hibernate.NonUniqueResultException;
import org.hibernate.engine.jndi.spi.JndiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> saveUser(List<User> userList){
        return userRepository.saveAll(userList);

    }


   public  User finById(Long id){
       return userRepository.findAllByIdUser(id);

   }

   public User findByUsername(String username){
        return userRepository.findByUserName(username);
   }

    public List<User> getAllUser(){
        return userRepository.findAll();

    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
