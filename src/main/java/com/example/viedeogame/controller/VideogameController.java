package com.example.viedeogame.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.viedeogame.model.Videogame;
import com.example.viedeogame.service.VideogameService;
@RestController
@RequestMapping("/api/v1/videogames")
public class VideogameController {
  

    @Autowired  
    private VideogameService videogameService;

    @GetMapping
    public ArrayList<Videogame> listarvideogames() {
        return videogameService.getVideogames();
    }
        

    
    
}

