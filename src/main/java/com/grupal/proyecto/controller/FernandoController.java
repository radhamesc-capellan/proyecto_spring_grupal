package com.grupal.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.grupal.proyecto.service.IReversorService;

@RestController
public class FernandoController {
    
    @Autowired
    public IReversorService reversorService;
    
    @GetMapping("/reversar")
    public String reversarTexto(@RequestParam String texto) {
        return reversorService.reversar(texto);
    }
    
    @PostMapping("/reversar")
    public String reversarTextoPost(@RequestBody String texto) {
        return reversorService.reversar(texto);
    }
}

