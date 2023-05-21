package com.anderson.dslist.repositories;

import com.anderson.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
