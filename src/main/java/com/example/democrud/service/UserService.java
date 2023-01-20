package com.example.democrud.service;

import com.example.democrud.entity.User;
import com.example.democrud.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.hibernate.engine.jndi.spi.JndiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> saveUser(List<User> userList){
        List<User> risposta = (List<User>) userRepository.saveAll(userList);
        return risposta;
    }

}
