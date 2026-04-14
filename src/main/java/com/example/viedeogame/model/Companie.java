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
    private Long id;
    @NotBlank
    private String name;
    private String country;

    @Builder.Default
    @OneToMany(mappedBy="companie")
    private Set<Console> consoles = new HashSet<>();
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Companie)) return false;

        Companie other =(Companie) o;
        return id!=null && id.equals(other.getId());

    }
    @Override
    public int hashCode(){
        return 31;
    }
    

    
}
