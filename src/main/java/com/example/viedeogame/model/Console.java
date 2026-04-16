package com.example.viedeogame.model;

import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


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
    private Long id;
    @NotBlank
    private String name;

    private Integer releaseyear;

    @ManyToOne
    @JoinColumn(name="Companie_id",nullable = false)
    private Companie companie;

    @Builder.Default
    @ManyToMany(mappedBy = "consoles")
    private Set<Videogame> videogames = new HashSet<>();

    @Override
    public boolean equals(Object o){
        if(this == o) return true;

        if(!(o instanceof Console)) return false;

        Console other =(Console) o;
        return id!=null && id.equals(other.getId());

    }
    @Override
    public int hashCode(){
        return 31;
    }
}
