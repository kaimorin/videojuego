package com.example.viedeogame.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
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
    private String country;

    @OneToMany(mappedBy="companie")

    private Set<Console> consoles = new HashSet<>();
}
