package com.dev.isaque.listgames.dto;


import org.springframework.beans.BeanUtils;
import com.dev.isaque.listgames.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class GameDTO {
	
	private Long id;
	private String title;	
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
    //construtor vazio foi suprimido pela anotation, @RequiredArgsConstructor 
	
	
	
    public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
}
