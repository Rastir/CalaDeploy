package com.todocodeacademy.clinica_veterinaria.service;


import com.todocodeacademy.clinica_veterinaria.model.Aqualover;
import java.util.List;

public interface IAqualoverService {
    
    //CRUD METHOD.
    //Create
    public void saveAqualover(Aqualover aqualover);
    // Read
    //Read of only one person
    public Aqualover findAqualover (Long id);
    // Read method to bring all the people
    public List<Aqualover> getAqualover();
    // Update
    public void editAqualover (Aqualover aqualover);
    //Delete
    public void deleteAqualover (Long id);
    
    
}
