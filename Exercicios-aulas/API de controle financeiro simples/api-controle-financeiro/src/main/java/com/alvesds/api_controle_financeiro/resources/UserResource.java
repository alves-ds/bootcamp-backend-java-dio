package com.alvesds.api_controle_financeiro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvesds.api_controle_financeiro.entity.User;
import com.alvesds.api_controle_financeiro.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> searchAll(){
        List<User> list = service.searchAll();
        return ResponseEntity.ok().body(list);
    } 

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> searchAll(@PathVariable Long id){
        User user = service.searchById(id);
        return ResponseEntity.ok().body(user);
    }

}
