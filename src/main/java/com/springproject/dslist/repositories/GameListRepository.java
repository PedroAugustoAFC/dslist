package com.springproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
