package com.anderson.dslist.services;

import com.anderson.dslist.dto.GameDTO;
import com.anderson.dslist.dto.GameMinDTO;
import com.anderson.dslist.entities.Game;
import com.anderson.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        
        //Transforma a lista com a classe Game para uma lista com a classe GameMinDTO
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
    
    @Transactional(readOnly = true)
    public GameDTO findByID(Long gameID){
        Game result = gameRepository.findById(gameID).get();
        GameDTO dto = new GameDTO(result);
        
        return dto;
    }
}
