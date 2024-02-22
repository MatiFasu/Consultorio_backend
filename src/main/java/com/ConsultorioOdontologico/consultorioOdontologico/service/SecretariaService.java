
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Secretaria;
import com.ConsultorioOdontologico.consultorioOdontologico.repository.ISecretariaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecretariaService implements ISecretariaService {
    
    @Autowired
    private ISecretariaRepository secreRepo;

    @Override
    public List<Secretaria> getSecretarias() {
        return secreRepo.findAll();
    }

    @Override
    public void saveSecretaria(Secretaria s) {
        secreRepo.save(s);
    }

    @Override
    public void deleteSecretaria(Long id) {
        secreRepo.deleteById(id);
    }

    @Override
    public Secretaria findSecretaria(Long id) {
        return secreRepo.findById(id).orElse(null);
    }

    @Override
    public void editSecretaria(Secretaria s) {
        this.saveSecretaria(s);
    }
    
    
    
}
