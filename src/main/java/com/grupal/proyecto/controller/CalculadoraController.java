package com.grupal.proyecto.controller;

import com.grupal.proyecto.service.CalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/calculadora")
    public class CalculadoraController {

        private final CalculadoraService service;

        public CalculadoraController(CalculadoraService service) {
            this.service = service;
        }

        @GetMapping("/sumar")
        public double sumar(
                @RequestParam double a,
                @RequestParam double b) {

            return service.sumar(a, b);
        }

        @GetMapping("/restar")
        public double restar(
                @RequestParam double a,
                @RequestParam double b) {

            return service.restar(a, b);
        }

        @GetMapping("/multiplicar")
        public double multiplicar(
                @RequestParam double a,
                @RequestParam double b) {

            return service.multiplicar(a, b);
        }

        @GetMapping("/dividir")
        public double dividir(
                @RequestParam double a,
                @RequestParam double b) {

            return service.dividir(a, b);
        }
    }


