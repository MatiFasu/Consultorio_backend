
package com.ConsultorioOdontologico.consultorioOdontologico.controller;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Turno;
import com.ConsultorioOdontologico.consultorioOdontologico.service.ITurnoService;
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
public class TurnoController {
    
    @Autowired
    private ITurnoService turnoServ;
    
    @GetMapping("/turno/traer")
    public List<Turno> getTurnos() {
        return turnoServ.getTurnos();
    }
    
    @GetMapping("/turno/traer/{id}")
    public Turno getTurno(@PathVariable Long id) {
        return turnoServ.findTurno(id);
    }
    
    @PostMapping("/turno/crear")
    public String saveTurno(@RequestBody Turno t) {
        turnoServ.saveTurno(t);
        return "Turno creado correctamente!";
    }
    
    @DeleteMapping("/turno/borrar/{id}")
    public String deleteTurno(@PathVariable Long id) {
        turnoServ.deleteTurno(id);
        return "Turno borrado correctamente!";
    }
    
    @PutMapping("/turno/editar")
    public String editTurno(@RequestBody Turno t) {
        turnoServ.editTurno(t);
        return "Turno editado correctamente!";
    }
    
}
