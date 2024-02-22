
package com.ConsultorioOdontologico.consultorioOdontologico.controller;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Usuario;
import com.ConsultorioOdontologico.consultorioOdontologico.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuServ;
    
    @CrossOrigin("http://127.0.0.1:5500")
    @GetMapping("/usuario/traer")
    public List<Usuario> getUsuarios() {
        return usuServ.getUsuario();
    }
    
    @GetMapping("/usuario/traer/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        return usuServ.findUsuario(id);
    }
    
    @PostMapping("/usuario/crear")
    public String saveUsuario(@RequestBody Usuario u) {
        usuServ.saveUsuario(u);
        return "Usuario creado correctamente!";
    }
    
    @DeleteMapping("/usuario/borrar/{id}")
    public String deleteUsuario(@PathVariable Long id) {
        usuServ.deleteUsuario(id);
        return "Usuario borrado correctamente!";
    }
    
    @PutMapping("/usuario/editar")
    public String editUsuario(@RequestBody Usuario u) {
        usuServ.editUsuario(u);
        return "Usuario editado correctamente!";
    }
    
    
}
