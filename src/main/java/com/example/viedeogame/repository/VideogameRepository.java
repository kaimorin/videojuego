package com.example.viedeogame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.viedeogame.model.Videogame;

public interface VideogameRepository extends JpaRepository<Videogame, Long> {

}
