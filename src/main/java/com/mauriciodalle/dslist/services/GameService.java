package com.mauriciodalle.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mauriciodalle.dslist.dto.GameDTO;
import com.mauriciodalle.dslist.dto.GameMinDTO;
import com.mauriciodalle.dslist.entities.Game;
import com.mauriciodalle.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findByid(Long id) {
		Game result = gameRepository.findById(id).get();
	    return new GameDTO(result);
	}

	@Transactional(readOnly = true)
    public List <GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
