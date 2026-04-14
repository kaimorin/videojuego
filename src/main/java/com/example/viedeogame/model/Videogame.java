package com.example.viedeogame.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
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
    private Long id;
    @NotBlank
    private String title;
    private String genre;

    private Integer releaseyear;

    private String developer;
    @Builder.Default
    @ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name="Videogame_console",
        joinColumns = @JoinColumn(name="videogame_id"),
        inverseJoinColumns = @JoinColumn(name="console_id")
    )
    private Set<Console> consoles= new HashSet<>();
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Videogame)) return false;

        Videogame other =(Videogame) o;
        return id!=null && id.equals(other.getId());

    }
    @Override
    public int hashCode(){
        return 31;
    }
}
