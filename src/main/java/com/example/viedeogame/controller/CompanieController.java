package com.example.viedeogame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.viedeogame.dto.CompanieDTO;
import com.example.viedeogame.service.CompanieService;


@RestController
@RequestMapping("/api/v1/companies")
public class CompanieController {
    @Autowired  
    private CompanieService companieService;

    @GetMapping
    private List<CompanieDTO> listaCompanias(){
        return companieService.FindAll();
    }

     
}
