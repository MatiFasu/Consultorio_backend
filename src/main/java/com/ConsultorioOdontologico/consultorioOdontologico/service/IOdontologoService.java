package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Odontologo;
import java.util.List;


public interface IOdontologoService {
    
    public List<Odontologo> getOdontologos();
    
    public void saveOdontologo(Odontologo o);
    
    public void deleteOdontologo(Long id);
    
    public Odontologo findOdontologo(Long id);
    
    public void editOdontologo(Odontologo o);
    
}
