package com.springproject.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.dslist.DTO.GameListDTO;
import com.springproject.dslist.entities.GameList;
import com.springproject.dslist.repositories.GameListRepository;



@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
