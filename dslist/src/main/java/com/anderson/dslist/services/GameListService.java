package com.anderson.dslist.services;

import com.anderson.dslist.dto.GameListDTO;
import com.anderson.dslist.entities.GameList;
import com.anderson.dslist.repositories.GameListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        
        //Transforma a lista com a classe GameList para uma lista com a classe GameListDTO
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
    
}
