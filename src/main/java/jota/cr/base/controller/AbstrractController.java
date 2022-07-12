package jota.cr.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/api/")
public abstract class AbstrractController<T,S> implements Serializable {

    protected T elemento;
    protected List<T> lista;
    protected S servicio;
}
