
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Odontologo;
import com.ConsultorioOdontologico.consultorioOdontologico.repository.IOdontologoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OdontologoService implements IOdontologoService{
    
    @Autowired
    private IOdontologoRepository odontoRepo;

    @Override
    public List<Odontologo> getOdontologos() {
        return odontoRepo.findAll();
    }

    @Override
    public void saveOdontologo(Odontologo o) {
        odontoRepo.save(o);
    }

    @Override
    public void deleteOdontologo(Long id) {
        odontoRepo.deleteById(id);
    }

    @Override
    public Odontologo findOdontologo(Long id) {
        return odontoRepo.findById(id).orElse(null);
    }

    @Override
    public void editOdontologo(Odontologo o) {
        this.saveOdontologo(o);
    }
    
    
    
}
