package com.ConsultorioOdontologico.consultorioOdontologico.service;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> getUsuario();
    
    public void saveUsuario(Usuario u);
    
    public void deleteUsuario(Long id);
    
    public Usuario findUsuario(Long id);
    
    public void editUsuario(Usuario u);
    
}
