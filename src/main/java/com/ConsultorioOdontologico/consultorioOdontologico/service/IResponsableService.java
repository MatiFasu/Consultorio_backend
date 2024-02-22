
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Responsable;
import java.util.List;


public interface IResponsableService {
    
    public List<Responsable> getResponsables();
    
    public void saveResponsable(Responsable r);
    
    public void deleteResponsable(Long id);
    
    public Responsable findResponsable(Long id);
    
    public void editResponsable(Responsable r);
    
}
