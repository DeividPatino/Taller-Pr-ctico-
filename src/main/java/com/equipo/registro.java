
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.equipo;

import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class registro {
 


    private static HashMap<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Usuario ===");
        System.out.print("Ingrese un nombre de usuario: ");
        String usuario = scanner.nextLine();

        if (usuarios.containsKey(usuario)) {
            System.out.println("❌ El usuario ya existe. Intente con otro.");
        } else {
            System.out.print("Ingrese una contraseña: ");
            String password = scanner.nextLine();

            usuarios.put(usuario, password);
            System.out.println("✅ Registro exitoso. Usuario guardado!");
        }

        scanner.close();
    }
}

    

