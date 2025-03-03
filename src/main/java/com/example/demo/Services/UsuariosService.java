package com.example.demo.Services;

import com.example.demo.DAO.Entities.UsuariosEntity;
import com.example.demo.DAO.Repositories.UsuariosRepository;
import com.example.demo.Interfaces.IUsuarioService;
import com.example.demo.Payload.Request.PayloadLogin;
import com.example.demo.Payload.Responses.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Servicio encargado de la lógica de negocio relacionada con los usuarios.
 * Implementa la interfaz IUsuarioService para registrar usuarios y validar credenciales al iniciar sesión.
 */
@Service
public class UsuariosService implements IUsuarioService {

    // Inyección del repositorio para acceder a la base de datos de usuarios.
    @Autowired
    private UsuariosRepository usuarioRepository;

    /**
     * Registra un nuevo usuario en la base de datos.
     *
     * @param usuario Objeto que contiene la información del usuario a registrar.
     * @return ResponseEntity que contiene el usuario registrado si la operación fue exitosa,
     *         o un mensaje de error en caso de que ocurra una excepción.
     */
    public ResponseEntity registrarUsuario(UsuariosEntity usuario) {
        try {
            // Guarda el nuevo usuario en la base de datos
            UsuariosEntity nuevoUsuario = usuarioRepository.save(usuario);
            // Retorna una respuesta HTTP 200 (OK) con el usuario recién guardado
            return ResponseEntity.ok(nuevoUsuario);
        } catch (Exception e) {
            // En caso de error, retorna una respuesta HTTP 400 (Bad Request) con el mensaje de error
            return ResponseEntity.badRequest().body("Error al registrar el usuario: " + e.getMessage());
        }
    }

    /**
     * Valida las credenciales de un usuario para iniciar sesión.
     *
     * @param data Objeto que contiene el nombre de usuario y la contraseña.
     * @return ResponseEntity con un ObjectResponse que indica el resultado de la validación:
     *         - Código 0 y mensaje "Usuario valido" si las credenciales son correctas.
     *         - Código -1 y mensaje de error si las credenciales son incorrectas o ocurre un error.
     */
    @Override
    public ResponseEntity<ObjectResponse> iniciarSesion(PayloadLogin data) {
        try {
            // Llama al método del repositorio que valida el usuario. Se espera que retorne 1 si es correcto.
            Integer resultadoValidacion = usuarioRepository.validateUser(data.getUsername(), data.getPassword());

            if (resultadoValidacion == 1) {
                // Credenciales correctas: retorna una respuesta exitosa con mensaje de validación
                return ResponseEntity.ok().body(new ObjectResponse(0, "Usuario valido"));
            } else {
                // Credenciales incorrectas: retorna un mensaje indicando el error
                return ResponseEntity.ok().body(new ObjectResponse(-1, "Usuario o contaseña incorrecto"));
            }
        } catch (Exception e) {
            // En caso de error inesperado, retorna una respuesta HTTP 500 (Internal Server Error)
            return ResponseEntity.internalServerError().body(new ObjectResponse(-1, "Ocurrió un error inesperado al intentar validar el usuario: " + e.getMessage()));
        }
    }
}
