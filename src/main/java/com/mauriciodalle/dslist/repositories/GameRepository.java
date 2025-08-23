package com.mauriciodalle.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauriciodalle.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
