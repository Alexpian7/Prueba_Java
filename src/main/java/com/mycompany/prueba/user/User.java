package com.mycompany.prueba.user;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")  // Asegúrate de que el nombre de la tabla sea correcto en tu base de datos
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = false, length = 50)
    private String documento;

    @Column(unique = false, length = 50)
    private String email;

    @Column(length = 100)
    private String nombre;

    private boolean enabled;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
