package jota.cr.base.service;

import jota.cr.base.entity.Menu;
import jota.cr.base.repository.MenuRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuRepository repository;

    public List<Menu> findAll(){
        return repository.findAll();
    }

}
