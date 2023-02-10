package com.example.Menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Menu.entity.Menu;
import com.example.Menu.exception.MenuNotFoundException;
import com.example.Menu.service.MenuService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MenuController {

	@Autowired
	MenuService menuService;
	
	@GetMapping("/getmenubyid/{id}")
	public Menu getMenuById(@PathVariable ("id") int id) throws MenuNotFoundException {
		log.info("Menu");
		return menuService.getMenuById(id);
		
	}
	@GetMapping("/allmenus")
	public List<Menu> allMenu() {
		return menuService.allMenu();
		
	}
	@GetMapping("/allavailablemenus")
	public List<Menu> avaliableMenu() {
		return menuService.avaliableMenu();
		
	}
	
}
