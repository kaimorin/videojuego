package com.example.viedeogame.dto;



import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsoleDTO {
    private Long id;
    private String name;
    private Integer releaseyear;
    private CompanieDTO companie;
    
}
