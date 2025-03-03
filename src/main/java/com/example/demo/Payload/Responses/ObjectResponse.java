package com.example.demo.Payload.Responses;

/**
 * Clase que encapsula una respuesta genérica de la aplicación.
 * Permite retornar un código y un mensaje asociado a una operación.
 */
public class ObjectResponse {

    // Código que indica el resultado de la operación (por ejemplo, 0 para éxito, -1 para error).
    private Integer code;

    // Mensaje descriptivo asociado a la respuesta.
    private String message;

    /**
     * Constructor por defecto necesario para procesos de deserialización.
     */
    public ObjectResponse() {
    }

    /**
     * Constructor que inicializa la respuesta con un código y un mensaje.
     *
     * @param code    Código de respuesta.
     * @param message Mensaje descriptivo.
     */
    public ObjectResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Obtiene el código de respuesta.
     *
     * @return Código de respuesta.
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Establece el código de respuesta.
     *
     * @param code Nuevo código de respuesta.
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Obtiene el mensaje descriptivo de la respuesta.
     *
     * @return Mensaje descriptivo.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Establece el mensaje descriptivo de la respuesta.
     *
     * @param message Nuevo mensaje descriptivo.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
