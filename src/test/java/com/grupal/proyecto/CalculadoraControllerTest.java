package com.grupal.proyecto;

import com.grupal.proyecto.controller.CalculadoraController;
import com.grupal.proyecto.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CalculadoraController.class)
class CalculadoraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private CalculadoraService service;

    @Test
    void shouldReturnSum() throws Exception {
        when(service.sumar(10, 5)).thenReturn(15.0);

        mockMvc.perform(get("/calculadora/sumar")
                        .param("a", "10")
                        .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("15.0"));
    }

    @Test
    void shouldReturnSubtraction() throws Exception {
        when(service.restar(10, 5)).thenReturn(5.0);

        mockMvc.perform(get("/calculadora/restar")
                        .param("a", "10")
                        .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5.0"));
    }

    @Test
    void shouldReturnMultiplication() throws Exception {
        when(service.multiplicar(10, 5)).thenReturn(50.0);

        mockMvc.perform(get("/calculadora/multiplicar")
                        .param("a", "10")
                        .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("50.0"));
    }

    @Test
    void shouldReturnDivision() throws Exception {
        when(service.dividir(10, 5)).thenReturn(2.0);

        mockMvc.perform(get("/calculadora/dividir")
                        .param("a", "10")
                        .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("2.0"));
    }
}
