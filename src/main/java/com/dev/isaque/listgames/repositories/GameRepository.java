package com.dev.isaque.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.isaque.listgames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
