package com.equipo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void testLoginCorrecto() {
        Login login = new Login();
        assertTrue(login.autenticar("admin", "1234"));
    }

    @Test
    void testLoginIncorrecto() {
        Login login = new Login();
        assertFalse(login.autenticar("admin", "claveMala"));
    }

    @Test
    void testUsuarioInexistente() {
        Login login = new Login();
        assertFalse(login.autenticar("pepe", "1234"));
    }

    @Test
    void testLoginConCamposVacios() {
        Login login = new Login();
        assertFalse(login.autenticar("", ""));
    }
}
