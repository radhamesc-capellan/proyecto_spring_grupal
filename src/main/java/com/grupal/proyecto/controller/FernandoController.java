package com.grupal.proyecto.controller;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;
import com.grupal.proyecto.service.IReversorService;

@RestController
public class FernandoController {
    
    @Autowired
    public IReversorService reversorService;
    
    @GetMapping("/reversar")
    public String reversarTexto(@RequestParam String texto) {
        return HtmlUtils.htmlEscape(reversorService.reversar(texto), StandardCharsets.UTF_8.name());
    }
    
    @PostMapping("/reversar")
    public String reversarTextoPost(@RequestBody String texto) {
        return HtmlUtils.htmlEscape(reversorService.reversar(texto), StandardCharsets.UTF_8.name());
    }
}
