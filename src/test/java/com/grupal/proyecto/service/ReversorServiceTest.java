package com.grupal.proyecto.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversorServiceTest {

    private ReversorService reversorService;

    @BeforeEach
    void setUp() {
        reversorService = new ReversorService();
    }

    @Test
    void testReversarTextoSimple() {
        String original = "Hola";
        String resultado = reversorService.reversar(original);
        assertEquals("aloH", resultado);
    }

    @Test
    void testReversarTextoVacio() {
        String original = "";
        String resultado = reversorService.reversar(original);
        assertEquals("", resultado);
    }

    @Test
    void testReversarUnCaracter() {
        String original = "A";
        String resultado = reversorService.reversar(original);
        assertEquals("A", resultado);
    }

    @Test
    void testReversarConEspacios() {
        String original = "Hola Mundo";
        String resultado = reversorService.reversar(original);
        assertEquals("odnuM aloH", resultado);
    }

    @Test
    void testReversarConNumerosYSimbolos() {
        String original = "Test123!@#";
        String resultado = reversorService.reversar(original);
        assertEquals("#@!321tseT", resultado);
    }

    @Test
    void testDesreversarTextoSimple() {
        String reversado = "aloH";
        String resultado = reversorService.desreversar(reversado);
        assertEquals("Hola", resultado);
    }

    @Test
    void testDesreversarTextoVacio() {
        String reversado = "";
        String resultado = reversorService.desreversar(reversado);
        assertEquals("", resultado);
    }

    @Test
    void testDesreversarUnCaracter() {
        String reversado = "A";
        String resultado = reversorService.desreversar(reversado);
        assertEquals("A", resultado);
    }

    @Test
    void testDesreversarConEspacios() {
        String reversado = "odnuM aloH";
        String resultado = reversorService.desreversar(reversado);
        assertEquals("Hola Mundo", resultado);
    }

    @Test
    void testDesreversarConNumerosYSimbolos() {
        String reversado = "#@!321tseT";
        String resultado = reversorService.desreversar(reversado);
        assertEquals("Test123!@#", resultado);
    }

    @Test
    void testReversarYDesreversarTextoComplejo() {
        String original = "El rápido zorro marrón salta sobre el perro perezoso";
        String reversado = reversorService.reversar(original);
        String desreversado = reversorService.desreversar(reversado);
        assertEquals(original, desreversado);
    }

    @Test
    void testReversarYDesreversarTextoConAcentos() {
        String original = "Programación en Java";
        String reversado = reversorService.reversar(original);
        String desreversado = reversorService.desreversar(reversado);
        assertEquals(original, desreversado);
    }
}
