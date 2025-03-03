package com.example.demo.Controller;

// Importaciones necesarias para las entidades, servicios y utilidades de Spring
import com.example.demo.DAO.Entities.UsuariosEntity;
import com.example.demo.Interfaces.IUsuarioService;
import com.example.demo.Payload.Request.PayloadLogin;
import com.example.demo.Payload.Responses.ObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin("*") // Permite solicitudes desde cualquier origen. Para mayor seguridad, especifica los orígenes permitidos en producción.
@Controller // Indica que esta clase es un controlador de Spring MVC.
@RequestMapping("/api/usuarios") // Define la ruta base para todas las peticiones de usuario.
public class UsuariosController {

    @Autowired
    private IUsuarioService iUsuarioService; // Inyección de dependencia para el servicio de usuario.

    // Endpoint para registrar un nuevo usuario
    @PostMapping("/registrar-usuario")
    public ResponseEntity<?> registrarUsuario(@RequestBody UsuariosEntity usuario) {
        // Llama al método del servicio que registra al usuario y retorna la respuesta HTTP correspondiente.
        return iUsuarioService.registrarUsuario(usuario);
    }

    // Endpoint para iniciar sesión de un usuario
    @PostMapping("/iniciar-sesion")
    public ResponseEntity<ObjectResponse> iniciarSesion(@RequestBody PayloadLogin data){
        // Llama al método del servicio que gestiona la autenticación y retorna la respuesta con el estado de la sesión.
        return iUsuarioService.iniciarSesion(data);
    }
}

