package com.equipo;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> usuarios = new HashMap<>();

    public Login() {
        // Usuarios iniciales (puedes agregar más en tests si quieres)
        usuarios.put("admin", "1234");
        usuarios.put("juan", "abcd");
    }

    // Método para autenticar usuario
    public boolean autenticar(String usuario, String contrasena) {
        if (usuario == null || usuario.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            return false; // datos inválidos
        }
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena);
    }
}
