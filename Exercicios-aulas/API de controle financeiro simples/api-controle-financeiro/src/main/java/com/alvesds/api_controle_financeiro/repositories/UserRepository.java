package com.alvesds.api_controle_financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesds.api_controle_financeiro.entity.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
