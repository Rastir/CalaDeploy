package com.todocodeacademy.clinica_veterinaria.controller;

import com.todocodeacademy.clinica_veterinaria.model.Persona;
import com.todocodeacademy.clinica_veterinaria.model.Vip;
import com.todocodeacademy.clinica_veterinaria.service.IVipService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipController {

    private IVipService vipServ;

    @GetMapping("/vip/traer")
    public List<Vip> traerVip(){
        return vipServ.getVip();
    }

    @GetMapping("/vip/traer/{id}")
    public Vip findVip(@PathVariable Long id){
        return vipServ.findVip(id);
    }

    @PostMapping("/vip/crear")
    public String saveVip(@RequestBody Vip vip){
        vipServ.saveVip(vip);

        return "V.I.P creado correctamente";
    }

    @DeleteMapping("/vip/borrar/{id_vip}")
    public String deleteVip(@PathVariable Long id_vip){
        vipServ.deleteVip(id_vip);
        return "V.I.P borrado correctamente";
    }

    @PutMapping("/vip/editar")
    public String editVip(@RequestBody Vip vip){

        vipServ.editVip(vip);
        return "V.I.P editado correctamente";
    }

}
