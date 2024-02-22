
package com.ConsultorioOdontologico.consultorioOdontologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_horario;
    private String horario_inicio;
    private String horario_final;

    public Horario() {
    }

    public Horario(Long id_horario, String horario_inicio, String horario_final) {
        this.id_horario = id_horario;
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
    }
}
