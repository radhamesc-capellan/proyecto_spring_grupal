package com.grupal.proyecto;

import com.grupal.proyecto.service.CalculadoraService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    private final CalculadoraService service = new CalculadoraService();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(15.0, service.sumar(10, 5));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(5.0, service.restar(10, 5));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(50.0, service.multiplicar(10, 5));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(2.0, service.dividir(10, 5));
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.dividir(10, 0)
        );

        assertEquals("No se puede dividir entre cero.", exception.getMessage());
    }
}