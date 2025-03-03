package com.todocodeacademy.clinica_veterinaria.controller;

import com.todocodeacademy.clinica_veterinaria.model.Aquafriend;
import com.todocodeacademy.clinica_veterinaria.service.IAquafriendService;
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
public class AquafriendController {

    @Autowired
    private IAquafriendService aquaServ;

    @GetMapping("/aquafriend/traer")
    public List<Aquafriend> traerAquafriends(){
        return aquaServ.getAquafriend();
    }

    @GetMapping("/aquafriend/traer/{id}")
    public Aquafriend findAquafriend(@PathVariable Long id){
        return aquaServ.findAquafriend(id);
    }

    @PostMapping("/aquafriend/crear")
    public String saveAquafriend (@RequestBody Aquafriend aquafriend){
        aquaServ.saveAquafriend(aquafriend);

        return "Aquafriend creado correctamente";
    }

    @DeleteMapping("/aquafriend/borrar/{id_aquafriend}")
    public String deleteAquafriend (@PathVariable Long id_aquafriend){
        aquaServ.deleteAquafriend(id_aquafriend);
        return "Aquafriend borrado correctamente. ¡Yey!";
    }

    @PutMapping("/aquafriend/editar")
    public String editAquafriend (@RequestBody Aquafriend aquafriend){
        aquaServ.editAquafriend(aquafriend);

        return "Aquafriend editado correctamente !";
    }
}
