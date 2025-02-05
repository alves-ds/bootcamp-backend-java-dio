package com.alvesds.api_controle_financeiro.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alvesds.api_controle_financeiro.entity.User;
import com.alvesds.api_controle_financeiro.repositories.UserRepository;

@Configuration
@Profile("teste")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        User user1 = new User("Douglas", "douglas@email.com", "1234");

        User user2 = new User("Leo", "leo@email.com", "1234");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }

}
