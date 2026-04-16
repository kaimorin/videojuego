package com.example.viedeogame.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.viedeogame.dto.ConsoleDTO;
import com.example.viedeogame.service.ConsoleService;


@RestController
@RequestMapping("/api/v1/videogames")
public class ConsoleController {

    @Autowired
    private ConsoleService consoleService;

    @GetMapping
    public List<ConsoleDTO> listarConsole() {
        return consoleService.findAll();
       
    }
    

}
