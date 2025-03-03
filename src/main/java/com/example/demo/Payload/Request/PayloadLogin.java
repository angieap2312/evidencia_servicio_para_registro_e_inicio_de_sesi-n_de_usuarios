package com.example.demo.Payload.Request;

/**
 * Clase que representa la carga útil (payload) para el inicio de sesión.
 * Contiene las credenciales necesarias para autenticar a un usuario.
 */
public class PayloadLogin {

    // Nombre de usuario que se utilizará para iniciar sesión.
    private String username;

    // Contraseña correspondiente al usuario.
    private String password;

    /**
     * Constructor que inicializa el payload con el nombre de usuario y la contraseña.
     *
     * @param username el nombre de usuario.
     * @param password la contraseña del usuario.
     */
    public PayloadLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Constructor sin parámetros requerido para procesos de deserialización.
     */
    public PayloadLogin() {
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return el nombre de usuario.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param username el nuevo nombre de usuario.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene la contraseña.
     *
     * @return la contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña.
     *
     * @param password la nueva contraseña del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
