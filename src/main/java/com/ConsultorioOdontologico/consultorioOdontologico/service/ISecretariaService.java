package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Secretaria;
import java.util.List;


public interface ISecretariaService {
    
    public List<Secretaria> getSecretarias();
    
    public void saveSecretaria(Secretaria s);
    
    public void deleteSecretaria(Long id);
    
    public Secretaria findSecretaria(Long id);
    
    public void editSecretaria(Secretaria s);
    
}
