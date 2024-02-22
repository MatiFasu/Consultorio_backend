
package com.ConsultorioOdontologico.consultorioOdontologico.controller;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Odontologo;
import com.ConsultorioOdontologico.consultorioOdontologico.service.IOdontologoService;
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
public class OdontologoController {
    
    @Autowired
    private IOdontologoService odontoService;
    
    @GetMapping("/odontologo/traer")
    public List<Odontologo> getOdontologos() {
        return odontoService.getOdontologos();
    }
    
    @GetMapping("/odontologo/traer/{id_odon}")
    public Odontologo getOdontologo(@PathVariable Long id_odon) {
        return odontoService.findOdontologo(id_odon);
    }
    
    @PostMapping("/odontologo/crear")
    public String saveOdontologo(@RequestBody Odontologo odonto) {
        odontoService.saveOdontologo(odonto);
        return "Odontologo creado correctamente!";
    }
    
    @DeleteMapping("/odontologo/eliminar/{id_odonto}")
    public String deleteOdontologo(@PathVariable Long id_odonto) {
        odontoService.deleteOdontologo(id_odonto);
        return "Odontologo eliminado correctamente!";
    }
    
    @PutMapping("/odontologo/editar")
    public String editOdontologo(@RequestBody Odontologo odonto) {
        odontoService.editOdontologo(odonto);
        return "Odontologo editado correctamente!";
    }
    
    
    
}
