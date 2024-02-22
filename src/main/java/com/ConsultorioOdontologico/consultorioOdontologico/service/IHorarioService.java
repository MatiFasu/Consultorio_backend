package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Horario;
import java.util.List;


public interface IHorarioService {

    public List<Horario> getHorarios();
    
    public void saveHorario(Horario h);
    
    public void deleteHorario(Long id);
    
    public Horario findHorario(Long id);
    
    public void editHorario(Horario h);
    
}
