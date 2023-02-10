package com.example.Menu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.Menu.exception.MenuNotFoundException;
import com.example.Menu.model.ErrorResponse;


@RestControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(MenuNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleMenuNotFoundException(MenuNotFoundException e) {
		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND, e.getMessage());
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);	
	}
}