package com.example.demo1.API.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dto.CategoryDTO;
import com.example.demo1.service.ICategoryService;

@RestController(value ="categoryAPIOfAdmin")
public class CategoryAPI 
{
	@Autowired
	private ICategoryService categoryService ;

	@PostMapping("/api/category")
	public CategoryDTO create(@RequestBody @Valid CategoryDTO categoryDTO)
	{
		return categoryService.saveOrUpdate(categoryDTO);
	}
	@PutMapping("/api/category")
	public CategoryDTO update(@RequestBody @Valid CategoryDTO categoryDTO) 
	{
		return categoryService.saveOrUpdate(categoryDTO);
	}
	@DeleteMapping("/api/category")
	public void delete(@RequestBody long[] ids) 
	{
		categoryService.delete(ids);
	}
}
