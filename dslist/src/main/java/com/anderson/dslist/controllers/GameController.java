package com.anderson.dslist.controllers;

import com.anderson.dslist.dto.GameMinDTO;
import com.anderson.dslist.entities.Game;
import com.anderson.dslist.services.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
