package com.example.viedeogame.dto;

import java.util.List;

import com.example.viedeogame.model.Console;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideogameDTO {
    private Long id;
    private String title;
    private String genre;
    private Integer releaseyear;
    private String developer;

    private List<Console> consoles;
}
