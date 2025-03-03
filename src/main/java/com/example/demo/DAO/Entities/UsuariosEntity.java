package com.example.demo.DAO.Entities;

import jakarta.persistence.*;
import java.util.Date;

/**
 * Clase que representa la entidad "Usuarios" en la base de datos.
 * Cada instancia de esta clase corresponde a un registro en la tabla "usuarios".
 */
@Table(name = "usuarios")
@Entity
public class UsuariosEntity {

    /**
     * Constructor sin parámetros, necesario para frameworks que realizan deserialización o instanciación automática.
     */
    public UsuariosEntity() {
    }

    /**
     * Constructor completo para inicializar todos los atributos de la entidad.
     *
     * @param id              Identificador único del usuario.
     * @param nombre          Nombre del usuario.
     * @param apellido        Apellido del usuario.
     * @param correo          Correo electrónico del usuario.
     * @param telefono        Teléfono de contacto del usuario.
     * @param password        Contraseña del usuario (se recomienda encriptarla en producción).
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     * @param genero          Género del usuario.
     * @param fechaCreacion   Fecha en la que se creó el registro.
     * @param estado          Estado del usuario (por ejemplo, activo o inactivo).
     * @param username        Nombre de usuario para iniciar sesión.
     */
    public UsuariosEntity(Long id, String nombre, String apellido, String correo, String telefono, String password, Date fechaNacimiento, String genero, Date fechaCreacion, String estado, String username) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.username = username;
    }

    /**
     * Identificador único del usuario.
     * Se utiliza la estrategia IDENTITY para que la base de datos maneje el autoincremento.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // La base de datos asigna el valor automáticamente
    private Long id;

    // Nombre del usuario.
    private String nombre;

    // Apellido del usuario.
    private String apellido;

    // Correo electrónico del usuario.
    private String correo;

    // Teléfono de contacto del usuario.
    private String telefono;

    // Contraseña del usuario (se recomienda almacenar contraseñas encriptadas).
    private String password;

    // Fecha de nacimiento del usuario.
    private Date fechaNacimiento;

    // Género del usuario.
    private String genero;

    // Fecha en la que se creó el registro del usuario.
    private Date fechaCreacion;

    // Estado del usuario (por ejemplo, "activo" o "inactivo").
    private String estado;

    // Nombre de usuario utilizado para iniciar sesión.
    private String username;

    // Métodos getters y setters para acceder y modificar los atributos de la entidad.

    /**
     * Obtiene el identificador único del usuario.
     *
     * @return id del usuario.
     */
    public Long getId() {
        return id;
    }

    /**
     * Asigna el identificador único del usuario.
     *
     * @param id el id a asignar.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del usuario.
     *
     * @param nombre el nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asigna el apellido del usuario.
     *
     * @param apellido el apellido a asignar.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return correo electrónico.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Asigna el correo electrónico del usuario.
     *
     * @param correo el correo a asignar.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el teléfono del usuario.
     *
     * @return teléfono de contacto.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Asigna el teléfono del usuario.
     *
     * @param telefono el teléfono a asignar.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Asigna la contraseña del usuario.
     *
     * @param password la contraseña a asignar.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario.
     *
     * @return fecha de nacimiento.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Asigna la fecha de nacimiento del usuario.
     *
     * @param fechaNacimiento la fecha a asignar.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el género del usuario.
     *
     * @return género del usuario.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Asigna el género del usuario.
     *
     * @param genero el género a asignar.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la fecha de creación del registro del usuario.
     *
     * @return fecha de creación.
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Asigna la fecha de creación del registro del usuario.
     *
     * @param fechaCreacion la fecha a asignar.
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Obtiene el estado del usuario (por ejemplo, "activo" o "inactivo").
     *
     * @return estado del usuario.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Asigna el estado del usuario.
     *
     * @param estado el estado a asignar.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el nombre de usuario utilizado para iniciar sesión.
     *
     * @return nombre de usuario.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Asigna el nombre de usuario.
     *
     * @param username el nombre de usuario a asignar.
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
