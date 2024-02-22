
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Horario;
import com.ConsultorioOdontologico.consultorioOdontologico.repository.IHorarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioService implements IHorarioService {
    
    @Autowired
    private IHorarioRepository horarioRepo;

    @Override
    public List<Horario> getHorarios() {
        return horarioRepo.findAll();
    }

    @Override
    public void saveHorario(Horario h) {
        horarioRepo.save(h);
    }

    @Override
    public void deleteHorario(Long id) {
        horarioRepo.deleteById(id);
    }

    @Override
    public Horario findHorario(Long id) {
        return horarioRepo.findById(id).orElse(null);
    }

    @Override
    public void editHorario(Horario h) {
        this.saveHorario(h);
    }
    
    
    
}
