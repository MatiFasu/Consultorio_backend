
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Turno;
import java.util.List;


public interface ITurnoService {
 
    public List<Turno> getTurnos();
    
    public void saveTurno(Turno t);
    
    public void deleteTurno(Long id);
    
    public Turno findTurno(Long id);
    
    public void editTurno(Turno t);
    
}
