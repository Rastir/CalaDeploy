package com.todocodeacademy.clinica_veterinaria.controller;

import com.todocodeacademy.clinica_veterinaria.model.AquaAmigo;
import com.todocodeacademy.clinica_veterinaria.service.IAquaAmigoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AquaAmigoController {
    
    @Autowired
    private IAquaAmigoService amigoServ;
    
    @GetMapping("/amigos/traer")
    public List<AquaAmigo> traerAmigos(){
        return amigoServ.getAquaAmigo();
    }
    
    @GetMapping("/amigos/traer/{id}")
    public AquaAmigo findAmigo(@PathVariable Long id){
        return amigoServ.findAquamigo(id);
    }
    
    @PostMapping("/amigos/crear")
    public String saveAmigo(@RequestBody AquaAmigo amigo){
        amigoServ.saveAquamigo(amigo);
        
        return "Aquafriend creado correctamente";
    }
    
    @DeleteMapping("/amigos/borrar/{id_aquamigo}")
    public String deleteAquaAmigo(@PathVariable Long id_aquamigo){
        amigoServ.deleteAquaAmigo(id_aquamigo);
        return "Aquafriend borrado exitosamente";
    }
    
    @PutMapping("/amigos/editar")
    public String editAquaAmigo(@RequestBody AquaAmigo amigo){
        
        amigoServ.editAquaAmigo(amigo);
        return "Aquafriend editado correctamente";
    }
}
