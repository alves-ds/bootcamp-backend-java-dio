package com.alvesds.api_controle_financeiro.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvesds.api_controle_financeiro.entity.User;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity <User> findUsers(){
        User newUser = new User(1, "Douglas", "teste@email.com", "1234");
        return ResponseEntity.ok().body(newUser);
    }

}
