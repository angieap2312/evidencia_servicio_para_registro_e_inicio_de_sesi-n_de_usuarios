package com.example.demo.Interfaces;

import com.example.demo.DAO.Entities.UsuariosEntity;
import com.example.demo.Payload.Request.PayloadLogin;
import com.example.demo.Payload.Responses.ObjectResponse;
import org.springframework.http.ResponseEntity;

/**
 * Interfaz que define las operaciones relacionadas con la gestión de usuarios.
 * Proporciona métodos para registrar usuarios e iniciar sesión.
 */
public interface IUsuarioService {

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param usuario Objeto que contiene los datos del usuario a registrar.
     * @return ResponseEntity que encapsula la respuesta de la operación, la cual puede incluir
     *         información sobre el resultado del registro (por ejemplo, mensaje de éxito o error).
     */
    ResponseEntity<?> registrarUsuario(UsuariosEntity usuario);

    /**
     * Inicia sesión en el sistema utilizando las credenciales proporcionadas.
     *
     * @param data Objeto que contiene el nombre de usuario y la contraseña para la autenticación.
     * @return ResponseEntity que envuelve una respuesta del tipo ObjectResponse, la cual puede
     *         incluir información relevante sobre el proceso de autenticación.
     */
    ResponseEntity<ObjectResponse> iniciarSesion(PayloadLogin data);

}
