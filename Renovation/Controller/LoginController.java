package com.ex.Renovation.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.Renovation.Model.UserLogin;
import com.ex.Renovation.Service.LoginService;

@RestController 
public class LoginController {
	@Autowired
	LoginService loginService;
	@PostMapping("/user")
	public boolean addUsers(@RequestBody UserLogin userLogin) {
		return loginService.AddUsers(userLogin);
	}
	@GetMapping("users")
	public List<UserLogin> getAllUsers(){
		return loginService.getUsers();
	}
	@GetMapping("/listusers/{emailId}")
	public Optional<UserLogin> getUsersById(@PathVariable int emailId){
		return loginService.getUsers(emailId);
	}
   

}