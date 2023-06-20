package com.dev.isaque.listgames.dto;


import com.dev.isaque.listgames.entities.Game;
import com.dev.isaque.listgames.projections.GameMinProjection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GameMinDTO {
	
	private Long id;
	private String title;	
	private Integer year;
	private String imgUrl;
	private String shortDescription;
 
	//construtor vazio foi suprimido pela anotation, @RequiredArgsConstructor

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}
	
	
	
	
}
