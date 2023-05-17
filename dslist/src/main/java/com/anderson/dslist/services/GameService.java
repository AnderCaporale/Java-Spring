package com.anderson.dslist.services;

import com.anderson.dslist.dto.GameMinDTO;
import com.anderson.dslist.entities.Game;
import com.anderson.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        
        //Transforma a lista com a classe Game para uma lista com a classe GameMinDTO
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
