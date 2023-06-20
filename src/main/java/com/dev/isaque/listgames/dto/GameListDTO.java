package com.dev.isaque.listgames.dto;



import com.dev.isaque.listgames.entities.GameList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class GameListDTO {
	
	private Long id;
	private String name;
	
    //construtor vazio foi suprimido pela anotation, @RequiredArgsConstructor 
		
    public GameListDTO(GameList entity) {
    	id = entity.getId();
    	name = entity.getName();
    }
	
}
