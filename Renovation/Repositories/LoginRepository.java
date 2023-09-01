package com.ex.Renovation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.Renovation.Model.UserLogin;

public interface LoginRepository extends JpaRepository<UserLogin, Integer> {
	

}