package com.dev.isaque.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.isaque.listgames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	

}
