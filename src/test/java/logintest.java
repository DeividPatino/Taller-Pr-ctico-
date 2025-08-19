/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.equipo;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class logintest {

    @Test
    void autenticarUsuarioCorrecto() {
        Login login = new Login();
        assertTrue(login.autenticar("admin", "1234"));
    }

    @Test
    void autenticarUsuarioIncorrecto() {
        Login login = new Login();
        assertFalse(login.autenticar("user", "1234"));
    }

    @Test
    void autenticarContrasenaIncorrecta() {
        Login login = new Login();
        assertFalse(login.autenticar("admin", "0000"));
    }
}
