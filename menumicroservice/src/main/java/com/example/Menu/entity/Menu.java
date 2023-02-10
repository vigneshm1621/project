package com.example.Menu.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @AllArgsConstructor @ToString @NoArgsConstructor
@Entity
public class Menu {
	
	@Id
	private int menuId;
	private String menuName;
	private int price;
	private boolean avalibility; 
}
