package com.springproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
