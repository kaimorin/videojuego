package com.example.viedeogame.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.viedeogame.model.Videogame;
@Service
public class VideogameService {
    private ArrayList<Videogame> videogames= new ArrayList<>();

    
    public ArrayList<Videogame> getVideogames() {
      return videogames;
    }

}
