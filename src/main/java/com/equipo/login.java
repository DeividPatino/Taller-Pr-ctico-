
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.equipo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class login {

    private Map<String, String> usuarios = new HashMap<>();

    public login() {
        
        usuarios.put("admin", "1234");
        usuarios.put("juan", "abcd");
    }

 
    public boolean autenticar(String usuario, String contrasena) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena);
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        login login = new login();

        System.out.println("=== LOGIN ===");
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        if (login.autenticar(usuario, contrasena)) {
            System.out.println(" Bienvenido, " + usuario + "!");
        } else {
            System.out.println(" Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class login {

    @Test
    void testLoginCorrecto() {
        LoginService login = new LoginService();
        assertTrue(login.autenticar("admin", "1234"));
    }

    @Test
    void testLoginIncorrecto() {
        LoginService login = new LoginService();
        assertFalse(login.autenticar("admin", "malClave"));
    }

    @Test
    void testUsuarioInexistente() {
        LoginService login = new LoginService();
        assertFalse(login.autenticar("pepe", "1234"));
    }
}
