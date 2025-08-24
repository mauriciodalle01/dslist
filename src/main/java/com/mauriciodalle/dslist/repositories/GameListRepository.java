package com.mauriciodalle.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauriciodalle.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
