
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Paciente;
import java.util.List;


public interface IPacienteService {
    
    public List<Paciente> getPacientes();
    
    public void savePaciente(Paciente p);
    
    public void deletePaciente(Long id);
    
    public Paciente findPaciente(Long id);
    
    public void editPaciente(Paciente p);
    
}
