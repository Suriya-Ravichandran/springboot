package com.example.userdataAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userdataAPI.Exception.ResourceNotFoundExection;
import com.example.userdataAPI.entity.Userentity;
import com.example.userdataAPI.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {
//	@GetMapping
//	public String getUser() {
//		return "Hello world";
//	} 
//	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<Userentity>getUser(){
		return userRepository.findAll();
	}
	
	@PostMapping
	public Userentity createUser(@RequestBody Userentity user) {
//		System.out.println("user add successfully");
		return userRepository.save(user);
	}
	
	@GetMapping("/{id}")
	public Userentity getUserById(@PathVariable Long id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExection("User Not Found With this id:"+id));
		
	}
	@PutMapping("/{id}")
	public Userentity updateuser(@RequestBody Userentity user,@PathVariable Long id) {
		Userentity userdata=userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExection("User Not Found With this id:"+id));
		userdata.setEmail(user.getEmail());
		userdata.setName(user.getName());
		userdata.setPassword(user.getPassword());
		return userRepository.save(userdata);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		Userentity userdata=userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExection("User Not Found With this id:"+id));
		userRepository.delete(userdata);
		return ResponseEntity.ok().build();
	}
	
	
	
}
