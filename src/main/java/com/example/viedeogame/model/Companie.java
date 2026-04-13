package com.example.viedeogame.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Entity
@Table (name="companies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Companie {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY )
    private long id;
    @NotBlank
    private String name;


}
