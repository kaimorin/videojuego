package com.example.viedeogame.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.viedeogame.dto.ConsoleDTO;

import com.example.viedeogame.model.Console;
import com.example.viedeogame.repository.ConsoleRepository;

@Service
public class ConsoleService {
    @Autowired
    private ConsoleRepository consoleRepository;

    public List<ConsoleDTO> findAll(){
        return  consoleRepository.findAll()
            .stream()
            .map(co-> new ConsoleDTO(co.getId(), co.getName(), co.getReleaseyear(),null))
            .collect(Collectors.toList());
    }
    
    public ConsoleDTO findById(Long id){
        return consoleRepository.findById(id)
            .map(co-> new ConsoleDTO(co.getId(), co.getName(), co.getReleaseyear(),null))
            .orElse(null);
    }
    public ConsoleDTO create(ConsoleDTO conso){
        Console con= new Console();
        con.setId(conso.getId());
        con.setName(conso.getName());
        con.setReleaseyear(conso.getReleaseyear());
        con.setCompanie(null);
        con= consoleRepository.save(con);
        return new ConsoleDTO(con.getId(), con.getName(), con.getReleaseyear(), null);
       
    }
    public ConsoleDTO update(Long id, ConsoleDTO conso){
        Console kao= consoleRepository.findById(id).orElseThrow(()-> new RuntimeException("Console not found with id: "+id));
        if(kao!=null){
            kao.setName(conso.getName());
            kao.setReleaseyear(conso.getReleaseyear());
            kao.setReleaseyear(conso.getReleaseyear());
            kao.setCompanie(null);
            return new ConsoleDTO(kao.getId(), kao.getName(), kao.getReleaseyear(), null);

        }else{
            return null;
        }

    }
    public String delete(long id){
        Console kae= consoleRepository.findById(id).orElseThrow(()-> new RuntimeException("Console not found with id: "+id));
        if(kae!=null){
            consoleRepository.delete(kae);
            return "Console deleted with success!!: "+id;
        }else{
            return "Console not found with id: "+id;
        }
    }
}
