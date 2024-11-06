package com.matchmingle;

import com.matchmingle.models.Usuario;
import com.matchmingle.services.UsuarioService;
import java.time.LocalDate;

public class MatchMingleProject {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a Match Mingle!");

        // Crear una instancia de UsuarioService
        UsuarioService usuarioService = new UsuarioService();

        // Crear un nuevo usuario
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre("Derik");
        nuevoUsuario.setEmail("derik@example.com");
        nuevoUsuario.setContraseña("contraseñaSegura123");
        nuevoUsuario.setFechaNacimiento(LocalDate.parse("2004-09-23"));
        nuevoUsuario.setGenero("Hombre");
        nuevoUsuario.setOrientacion("Heterosexual");

        // Llamar al método crearUsuario
        boolean resultado = usuarioService.crearUsuario(nuevoUsuario);

        if (resultado) {
            System.out.println("Usuario creado exitosamente.");
        } else {
            System.out.println("Error al crear el usuario.");
        }
    }
}
