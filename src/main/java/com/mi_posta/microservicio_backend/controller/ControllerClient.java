package com.mi_posta.microservicio_backend.controller;

import com.mi_posta.microservicio_backend.data.dto.AccountDao;
import com.mi_posta.microservicio_backend.data.entity.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/client")
public class ControllerClient {

    @Autowired
    AccountDao accountDao;


    @PostMapping(path = "/add_cita" , produces = MediaType.APPLICATION_JSON_VALUE)
    // void -> null || RespondeEntity
    public ResponseEntity<?> addCita(@RequestBody Cita modelCita) {
        System.out.println("Data information -> " + modelCita.toString());
        return ResponseEntity.ok(modelCita.toString());
    }

    @GetMapping(path = "/list_cita" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listCita(){
        return ResponseEntity.ok(accountDao.listActiveAccountsWithAccountType());
    }
    // String , Integer , etc


}
