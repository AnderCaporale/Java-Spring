package com.anderson.dslist.repositories;

import com.anderson.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
