package com.grupal.proyecto.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.grupal.proyecto.service.ReversorService;

class FernandoControllerTest {

    private FernandoController controller;
    private ReversorService reversorService;

    @BeforeEach
    void setUp() {
        reversorService = new ReversorService();
        controller = new FernandoController();
        controller.reversorService = reversorService;
    }

    @Test
    void testReversarTextoGet() {
        String textoOriginal = "Hola";
        String textoReversado = controller.reversarTexto(textoOriginal);
        assertEquals("aloH", textoReversado);
    }

    @Test
    void testReversarTextoPost() {
        String textoOriginal = "Spring";
        String textoReversado = controller.reversarTextoPost(textoOriginal);
        assertEquals("gnirpS", textoReversado);
    }

    @Test
    void testReversarTextoVacio() {
        String textoOriginal = "";
        String textoReversado = controller.reversarTexto(textoOriginal);
        assertEquals("", textoReversado);
    }

    @Test
    void testReversarTextoLargo() {
        String textoOriginal = "El rápido zorro marrón salta sobre el perro perezoso";
        String textoReversado = controller.reversarTextoPost(textoOriginal)+"x";
        assertEquals(new StringBuilder(textoOriginal).reverse().toString(), textoReversado);
    }
}