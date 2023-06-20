package com.dev.isaque.listgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.isaque.listgames.dto.GameListDTO;
import com.dev.isaque.listgames.dto.GameMinDTO;
import com.dev.isaque.listgames.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListControler {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findall(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	} 

 }
