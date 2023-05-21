package com.anderson.dslist.controllers;

import com.anderson.dslist.dto.GameListDTO;
import com.anderson.dslist.services.GameListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    @Autowired
    GameListService gameListService;
    
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    
}
