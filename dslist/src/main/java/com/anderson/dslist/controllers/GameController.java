package com.anderson.dslist.controllers;

import com.anderson.dslist.dto.GameDTO;
import com.anderson.dslist.dto.GameMinDTO;
import com.anderson.dslist.services.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
    
    @GetMapping(value = "/{id}")
    public GameDTO findByID(@PathVariable Long id){
        GameDTO result = gameService.findByID(id);
        return result;
    }
}
