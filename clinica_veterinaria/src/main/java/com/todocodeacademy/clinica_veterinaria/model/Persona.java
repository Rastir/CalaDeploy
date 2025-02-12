package com.todocodeacademy.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_persona;
    private String name;
    private String lastName;
    private String email;
    private int age;
    private boolean isLal;
    private int noVisit;
    private String foodAndBeverages;
    private String experience;
    private String butler;
    private String preference;
    private String alergies;
    private String notes;
    private String image;
    private String amaMoments;
    private String firstVisit;
    private String lastVisit;
        
    @OneToMany
    private List<Aqualover> aquaLevel;

}
