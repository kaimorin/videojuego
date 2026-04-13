package com.example.viedeogame.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Entity
@Table (name="videogames")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Videogame {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY )
    private long id;
    @NotBlank
    private String title;
    private String genre;

    private Integer releaseyear;

    private String developer;
}
