package com.user.jpa.controller;

import com.user.jpa.domain.Pengguna;
import com.user.jpa.domain.PenggunaDetail;
import com.user.jpa.service.impl.PenggunaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class PenggunaController {

    @Autowired
    PenggunaServiceImpl penggunaService;

    @GetMapping
    public Object getAll(){
        return penggunaService.findAll();
    }


    @PostMapping
    public Object save(@RequestBody Pengguna p, PenggunaDetail pd){
        return penggunaService.createUser(p,pd);
    }
}
