package com.grupal.proyecto.service;

import org.springframework.stereotype.Service;

@Service
public class ReversorService implements IReversorService {
    
    @Override
    public String reversar(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
}

