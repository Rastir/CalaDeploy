package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.AquaAmigo;
import com.todocodeacademy.clinica_veterinaria.repository.IAquaAmigoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AquaAmigoService implements IAquaAmigoService {
    
    @Autowired
    private IAquaAmigoRepository repoAmigo;

    @Override
    public void saveAquamigo(AquaAmigo aquamigo) {
        repoAmigo.save(aquamigo);
    }

    @Override
    public AquaAmigo findAquamigo(Long id) {
        return repoAmigo.findById(id).orElse(null);
    }

    @Override
    public List<AquaAmigo> getAquaAmigo() {
        List<AquaAmigo> listaAmigos = repoAmigo.findAll();
        return listaAmigos;
    }

    @Override
    public void editAquaAmigo(AquaAmigo aquamigo) {
        this.saveAquamigo(aquamigo);
    }

    @Override
    public void deleteAquaAmigo(Long id) {
        repoAmigo.deleteById(id);
    }
    
}
