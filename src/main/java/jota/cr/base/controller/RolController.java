package jota.cr.base.controller;


import jota.cr.base.entity.Rol;
import jota.cr.base.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RolController extends AbstrractController<Rol, RolService>{


    @Autowired
    public RolController(RolService service) {
        servicio = service;
    }

    @GetMapping(value = {"/rol/", "/rol"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Rol>> findAll() {

        ResponseEntity<List<Rol>> respuesta = null;
        try {
            lista = servicio.findAll();
            respuesta = new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-ErrorCode", "-1");
            headers.set("X-ErrorCause", e.getMessage());
            respuesta = new ResponseEntity<>(null, headers, HttpStatus.NO_CONTENT);
        }
        return respuesta;
    }
}