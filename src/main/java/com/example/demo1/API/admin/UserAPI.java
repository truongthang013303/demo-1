package com.example.demo1.API.admin;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.UserDTO;
import com.example.demo1.service.IUserService;

@RestController(value ="userAPIOfAdmin")
public class UserAPI {
	@Autowired
	private IUserService userService;
	
	@PostMapping("/api/user")
	public UserDTO createNew(@RequestBody UserDTO userDTO) 
	{
		userDTO.setRoleCode(Arrays.asList("USER"));
		userDTO.setStatus(1);
		return userService.saveOrUpdate(userDTO);
	}
	@DeleteMapping("/api/user")
	public void deleteNew(@RequestBody long[] ids) 
	{
		userService.delete(ids);
	}
	
	@PutMapping("/api/user")
	public UserDTO updateUser(@RequestBody UserDTO userDTO) 
	{
		userDTO.setStatus(1);
		return userService.saveOrUpdate(userDTO);
	}
}
