package com.example.democrud.service;

import com.example.democrud.entity.User;
import com.example.democrud.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.hibernate.NonUniqueResultException;
import org.hibernate.engine.jndi.spi.JndiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public Page<User> getUserPagination(Integer pageNumber, Integer pageSize) {
        Sort sort = Sort.by(Sort.Direction.ASC, "userName");
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
        return userRepository.findAll(pageable);
    }
}
