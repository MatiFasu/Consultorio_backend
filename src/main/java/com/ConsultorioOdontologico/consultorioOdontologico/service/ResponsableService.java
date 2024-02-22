
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Responsable;
import com.ConsultorioOdontologico.consultorioOdontologico.repository.IResponsableRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponsableService implements IResponsableService{
    
    @Autowired
    private IResponsableRepository responsableRepo;

    @Override
    public List<Responsable> getResponsables() {
        return responsableRepo.findAll();
    }

    @Override
    public void saveResponsable(Responsable r) {
        responsableRepo.save(r);
    }

    @Override
    public void deleteResponsable(Long id) {
        responsableRepo.deleteById(id);
    }

    @Override
    public Responsable findResponsable(Long id) {
        return responsableRepo.findById(id).orElse(null);
    }

    @Override
    public void editResponsable(Responsable r) {
        this.saveResponsable(r);
    }
    
    
    
}
