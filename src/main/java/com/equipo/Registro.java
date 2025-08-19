package com.equipo;

import java.util.HashMap;
import java.util.Map;

public class Registro {
    private Map<String, String> usuarios = new HashMap<>();

    // Método para registrar usuario
    public boolean registrar(String usuario, String password) {
        if (usuario == null || usuario.isEmpty() || password == null || password.isEmpty()) {
            return false; // datos inválidos
        }
        if (usuarios.containsKey(usuario)) {
            return false; // ya existe
        }
        usuarios.put(usuario, password);
        return true;
    }

    // Método de apoyo: cantidad de usuarios registrados
    public int cantidadUsuarios() {
        return usuarios.size();
    }
}
