package jota.cr.base.entity;

import javax.persistence.*;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import java.io.Serializable;

@Entity
@Table(name = "entidad_menu", schema = "proyecto_base")
@TypeDef(
        name = "jsonb",
        typeClass = JsonBinaryType.class
)
@Setter
@Getter
public class Menu implements Serializable {

    @Id
    @SequenceGenerator(name = "menu_id_seq", sequenceName = "menu_id_seq", initialValue = 1, allocationSize = 1, schema = "proyecto_base")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_id_seq")
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @ManyToOne(targetEntity = Rol.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "rol_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Rol rol;

    @Column(name = "descripcion")
    private String descripcion;

    @Type(type = "jsonb")
    @Column(name = "json_menu", nullable = true, columnDefinition = "jsonb")
    private String jsonMenu;


}
