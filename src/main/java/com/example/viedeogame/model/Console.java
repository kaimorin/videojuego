package com.example.viedeogame.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table (name="consoles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Console {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY )
    private long id;
    @NotBlank
    private String name;

    private Integer releaseyear;
    @ManyToAny
    @JoinColumn(name="Companie_id",nullable = false)
    private Companie companie;
}
