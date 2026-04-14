package com.example.viedeogame.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viedeogame.dto.CompanieDTO;
import com.example.viedeogame.repository.CompanieRepository;

@Service
public class CompanieService {
    @Autowired
    private CompanieRepository companieRepository;

    public List<CompanieDTO> FindAll() {
        return companieRepository.findAll()
            .stream()
            .map(c -> new CompanieDTO(c.getId(), c.getName(), c.getCountry()))
            .collect(Collectors.toList());
    }
}
