package com.example.demo.DAO.Repositories;

import com.example.demo.DAO.Entities.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Repositorio de usuarios que extiende JpaRepository para aprovechar métodos CRUD.
 * Además, incluye una consulta personalizada para validar las credenciales de un usuario.
 */
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Long> {

    /**
     * Método para validar un usuario mediante la verificación de las credenciales.
     * <p>
     * Esta consulta nativa SQL cuenta el número de registros en la tabla USUARIOS
     * que coincidan con el nombre de usuario y la contraseña proporcionados.
     *
     * @param user     Nombre de usuario a validar.
     * @param password Contraseña correspondiente al usuario.
     * @return Un entero que indica la cantidad de coincidencias encontradas
     * (se espera que sea 1 si las credenciales son correctas).
     */
    @Query(value = """
            SELECT COUNT(*) FROM USUARIOS WHERE USERNAME = :USER AND PASSWORD = :PASSWORD;
            """, nativeQuery = true)
    Integer validateUser(@Param("USER") String user, @Param("PASSWORD") String password);

}
