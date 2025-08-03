package com.mi_posta.microservicio_backend.controller;


import com.mi_posta.microservicio_backend.data.dto.MedicoDao;
import com.mi_posta.microservicio_backend.data.entity.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/medicos")
public class ControllerMedico {

    @Autowired
    MedicoDao medicoDao;

    @PostMapping(path = "/add_medico",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addMedico(@RequestBody Medico modelMedico){
        System.out.println("Data information" + modelMedico.toString());
        return ResponseEntity.ok(modelMedico);
    }

    @GetMapping(path = "/list_medico", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listMedico(){
        return ResponseEntity.ok(medicoDao.listMedicos());
    }
}
