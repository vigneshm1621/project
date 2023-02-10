package com.example.Menu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Menu.entity.Menu;
import com.example.Menu.exception.MenuNotFoundException;
import com.example.Menu.repository.MenuRepository;





@Service
public class MenuService {

	@Autowired
	MenuRepository
	menuRepository;

	@Transactional
	public Menu getMenuById(int id) throws MenuNotFoundException {
		Menu menu = menuRepository.findById(id).orElse(null);
		if(menu!=null) {
			return menu;
		}
		throw new MenuNotFoundException("Menu not found for this id");

	}

	@Transactional
	public List<Menu> allMenu() {
		return menuRepository.findAll();

	}

	@Transactional
	public List<Menu> avaliableMenu() {
		return menuRepository.getAllAvailableMenus();

	}
}
