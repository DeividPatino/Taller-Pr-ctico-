
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.equipo;
 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class login {
 
public class LoginConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Base de datos simulada con usuarios (usuario -> contraseña)
        Map<String, String> usuarios = new HashMap<>();
        usuarios.put("admin", "1234");
        usuarios.put("juan", "abcd");

        System.out.println("=== LOGIN ===");
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar credenciales
        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena)) {
            System.out.println(" Bienvenido, " + usuario + "!");
        } else {
            System.out.println(" Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}

    
}
