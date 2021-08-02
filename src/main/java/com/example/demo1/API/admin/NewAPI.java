package com.example.demo1.API.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.NewDTO;
import com.example.demo1.service.INewService;

@RestController(value ="newAPIOfAdmin")
public class NewAPI 
{
	@Autowired
	private INewService newService;

	@PostMapping("/api/new")
	public NewDTO createNew(@RequestBody @Valid NewDTO newDTO) 
	{
		return newService.saveOrUpdate(newDTO);
	}
	@PutMapping("/api/new")
	public NewDTO updateNew(@RequestBody @Valid NewDTO newDTO) 
	{
		return newService.saveOrUpdate(newDTO);
	}
	
	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody long[] ids) 
	{
		newService.delete(ids);
	}
}
