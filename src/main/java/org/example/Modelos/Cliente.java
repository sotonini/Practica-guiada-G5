package org.example.Modelos;

public class Cliente {
    private String nombre;

   private Integer edad;

   private String identificacion;

   private String correo;

   private String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, Integer edad, String identificacion, String correo, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
