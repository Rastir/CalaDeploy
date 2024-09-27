package com.todocodeacademy.clinica_veterinaria.repository;


import com.todocodeacademy.clinica_veterinaria.model.Aqualover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAqualoverRepository extends JpaRepository<Aqualover, Long>{
    
}
