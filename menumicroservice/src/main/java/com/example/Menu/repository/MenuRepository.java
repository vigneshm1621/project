package com.example.Menu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Menu.entity.Menu;


public interface MenuRepository extends JpaRepository<Menu, Integer> {

	@Query(value = "select * from menu where avalibility=true", nativeQuery = true)
	List<Menu> getAllAvailableMenus();

}
