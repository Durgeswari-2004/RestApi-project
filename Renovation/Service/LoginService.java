package com.ex.Renovation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.Renovation.Model.UserLogin;
import com.ex.Renovation.Repositories.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;
	public boolean AddUsers(UserLogin userLogin) {
		loginRepository.save(userLogin);
		return true;
	}
	public List<UserLogin> getUsers(){
		return loginRepository.findAll();
	}
	public Optional<UserLogin> getUsers(int emailId){
		return loginRepository.findById(emailId);
	}

	

}