package jota.cr.base.service;

import jota.cr.base.entity.Menu;
import jota.cr.base.entity.Rol;
import jota.cr.base.repository.MenuRepository;
import jota.cr.base.repository.RolRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class RolServiceImpl implements RolService{
    @Autowired
    private RolRepository repository;

    public List<Rol> findAll(){
        return repository.findAll();
    }

}
