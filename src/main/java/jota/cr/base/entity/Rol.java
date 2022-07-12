package jota.cr.base.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "entidad_rol", schema = "proyecto_base")
@Setter
@Getter
public class Rol implements Serializable {
    @Id
    @SequenceGenerator(name = "rol_id_seq", sequenceName = "rol_id_seq", initialValue = 1, allocationSize = 1, schema = "proyecto_base")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rol_id_seq")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;


}
