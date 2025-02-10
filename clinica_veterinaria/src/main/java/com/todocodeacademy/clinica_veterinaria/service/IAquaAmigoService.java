package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.AquaAmigo;
import java.util.List;

public interface IAquaAmigoService {
    
    //CRUD METHOD.
    //Create
    public void saveAquamigo (AquaAmigo aquamigo);
    // Read
    //Read of only one person
    public AquaAmigo findAquamigo (Long id_aquamigo);
    // Read method to bring all the people
    public List<AquaAmigo> getAquaAmigo();
    // Update
    public void editAquaAmigo(AquaAmigo aquamigo);
    //Delete
    public void deleteAquaAmigo(Long id_aquamigo);
}
