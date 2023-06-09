package com.dev.isaque.listgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.isaque.listgames.dto.GameMinDTO;
import com.dev.isaque.listgames.entities.Game;
import com.dev.isaque.listgames.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameControler {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	} 

 }
