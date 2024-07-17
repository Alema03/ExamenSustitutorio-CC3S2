package org.example;

public class SecurityTactics {
    // Método para autenticar usuarios
    public boolean authenticate(String username, String password) throws AuthenticationException {
        // Implementación básica para demostración
        return "admin".equals(username) && "password".equals(password);
    }

    // Método para autorizar acciones basadas en roles
    public boolean authorize(String username, String role) throws AuthorizationException {
        // Implementación básica para demostración
        return "admin".equals(role) || "user".equals(role);  // Ejemplo: admin y user tienen acceso
    }

    // Excepciones para manejar errores de autenticación y autorización
    public static class AuthenticationException extends Exception {
        public AuthenticationException(String message) {
            super(message);
        }
    }

    public static class AuthorizationException extends Exception {
        public AuthorizationException(String message) {
            super(message);
        }
    }
}
