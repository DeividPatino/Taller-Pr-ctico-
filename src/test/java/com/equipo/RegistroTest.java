package com.equipo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistroTest {

    @Test
    void testRegistroNuevoUsuario() {
        Registro registro = new Registro();
        assertTrue(registro.registrar("nuevoUser", "1234"));
        assertEquals(1, registro.cantidadUsuarios());
    }

    @Test
    void testRegistroUsuarioDuplicado() {
        Registro registro = new Registro();
        registro.registrar("juan", "abcd");
        assertFalse(registro.registrar("juan", "abcd")); // ya existe
        assertEquals(1, registro.cantidadUsuarios());
    }

    @Test
    void testRegistroConPasswordVacio() {
        Registro registro = new Registro();
        assertFalse(registro.registrar("maria", "")); // se permite pero guarda vacío
        assertEquals(0, registro.cantidadUsuarios());
    }

    @Test
    void testCantidadUsuarios() {
        Registro registro = new Registro();
        registro.registrar("a", "1");
        registro.registrar("b", "2");
        assertEquals(2, registro.cantidadUsuarios());
    }
}
