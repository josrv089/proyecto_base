package jota.cr.base.repository;

import jota.cr.base.entity.Menu;
import jota.cr.base.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol,Long> {
}
