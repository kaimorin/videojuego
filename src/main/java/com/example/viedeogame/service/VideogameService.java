package com.example.viedeogame.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viedeogame.dto.VideogameDTO;

import com.example.viedeogame.repository.VideogameRepository;
@Service
public class VideogameService {
    @Autowired
    private VideogameRepository videogameRepository;
    public List<VideogameDTO> findAll(){
        return  videogameRepository.findAll()
            .stream()
            .map(v -> new VideogameDTO(v.getId(), v.getTitle(), v.getGenre(), v.getReleaseyear(), v.getDeveloper(), null))
            .collect(Collectors.toList());
    }

}
