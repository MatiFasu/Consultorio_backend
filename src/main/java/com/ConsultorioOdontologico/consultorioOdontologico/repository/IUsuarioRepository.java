package com.ConsultorioOdontologico.consultorioOdontologico.repository;

import com.ConsultorioOdontologico.consultorioOdontologico.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
