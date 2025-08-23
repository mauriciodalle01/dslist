package com.mauriciodalle.dslist.services;

import com.mauriciodalle.dslist.dto.GameMinDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauriciodalle.dslist.controllers.GameMinDTO;
import com.mauriciodalle.dslist.entities.Game;
import com.mauriciodalle.dslist.repositories.GameRepository;

@Service
public class GameService {
    
	@Autowired
	private GameRepository gameRepository;
	
    public List <GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
    
}
