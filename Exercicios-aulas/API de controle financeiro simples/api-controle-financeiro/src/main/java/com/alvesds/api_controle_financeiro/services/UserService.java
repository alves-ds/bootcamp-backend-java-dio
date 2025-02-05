package com.alvesds.api_controle_financeiro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesds.api_controle_financeiro.entity.User;
import com.alvesds.api_controle_financeiro.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> searchAll(){
        return repository.findAll();
    }

    public User searchById(Long id){
        Optional<User> user = repository.findById(id); 
        return user.get();

    }

}
