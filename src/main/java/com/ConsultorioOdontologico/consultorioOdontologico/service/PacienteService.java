
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Paciente;
import com.ConsultorioOdontologico.consultorioOdontologico.repository.IPacienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService implements IPacienteService{
    
    @Autowired
    private IPacienteRepository pacRepo;

    @Override
    public List<Paciente> getPacientes() {
        return pacRepo.findAll();
    }

    @Override
    public void savePaciente(Paciente p) {
        pacRepo.save(p);
    }

    @Override
    public void deletePaciente(Long id) {
        pacRepo.deleteById(id);
    }

    @Override
    public Paciente findPaciente(Long id) {
        return pacRepo.findById(id).orElse(null);
    }

    @Override
    public void editPaciente(Paciente p) {
        this.savePaciente(p);
    }
    
}
