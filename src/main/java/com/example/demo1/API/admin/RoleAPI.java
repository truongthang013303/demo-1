package com.example.demo1.API.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.RoleDTO;
import com.example.demo1.service.IRoleService;

@RestController(value ="roleAPIOfAdmin")
public class RoleAPI 
{
	@Autowired
	private IRoleService roleService;
	@PostMapping("/api/role")
	public RoleDTO create(@RequestBody RoleDTO RoleDTO) 
	{
		return roleService.saveOrUpdate(RoleDTO);
	}
	@PutMapping("/api/role")
	public RoleDTO update(@RequestBody RoleDTO RoleDTO) 
	{
		return roleService.saveOrUpdate(RoleDTO);
	}
	@DeleteMapping("/api/role")
	public void delete(@RequestBody long[] ids) 
	{
		roleService.delete(ids);
	}
}
