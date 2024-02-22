
package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Usuario;
import com.ConsultorioOdontologico.consultorioOdontologico.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private IUsuarioRepository usuRepo;

    @Override
    public List<Usuario> getUsuario() {
        return usuRepo.findAll();
    }

    @Override
    public void saveUsuario(Usuario u) {
        usuRepo.save(u);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuRepo.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        return usuRepo.findById(id).orElse(null);
    }

    @Override
    public void editUsuario(Usuario u) {
        this.saveUsuario(u);
    }
    
}
