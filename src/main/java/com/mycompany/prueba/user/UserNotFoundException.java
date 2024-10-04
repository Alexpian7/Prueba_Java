package com.mycompany.prueba.user;

public class UserNotFoundException extends Throwable {
    public UserNotFoundException(String mensaje) {
        super(mensaje);
    }
}
