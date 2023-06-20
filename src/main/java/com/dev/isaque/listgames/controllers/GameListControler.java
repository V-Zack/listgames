package com.dev.isaque.listgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.isaque.listgames.dto.GameListDTO;
import com.dev.isaque.listgames.dto.GameMinDTO;
import com.dev.isaque.listgames.services.GameListService;
import com.dev.isaque.listgames.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListControler {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	
	@GetMapping
	public List<GameListDTO> findall(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	} 
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	} 

 }
