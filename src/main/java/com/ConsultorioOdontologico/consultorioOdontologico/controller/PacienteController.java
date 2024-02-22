
package com.ConsultorioOdontologico.consultorioOdontologico.controller;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Paciente;
import com.ConsultorioOdontologico.consultorioOdontologico.service.IPacienteService;
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
public class PacienteController {
    
    @Autowired
    private IPacienteService pacServ;
    
    @GetMapping("/paciente/traer")
    public List<Paciente> getPacientes() {
        return pacServ.getPacientes();
    }
    
    @GetMapping("/paciente/traer/{id}")
    public Paciente getPaciente(@PathVariable Long id) {
        return pacServ.findPaciente(id);
    }
    
    @PostMapping("/paciente/crear")
    public String savePaciente(@RequestBody Paciente pac) {
        pacServ.savePaciente(pac);
        return "Paciente creado correctamente!";
    }
    
    @DeleteMapping("/paciente/eliminar/{id}")
    public String deletePaciente(@PathVariable Long id) {
        pacServ.deletePaciente(id);
        return "Paciente eliminado correctamente!";
    }
    
    @PutMapping("/paciente/editar")
    public String editOdontologo(@RequestBody Paciente pac) {
        pacServ.editPaciente(pac);
        return "Paciente editado correctamente!";
    }
    
}
