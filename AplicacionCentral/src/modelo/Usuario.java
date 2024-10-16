package modelo;

import java.time.LocalDate;; 

//Agus

public class Usuario {
    

    private int id;
    private String nombre;
    private String apellido;
    private String documento;
    private LocalDate fechaNacimiento;
    private String contraseña;
    private String mail;
    private int rol;

    // Constructor
    public Usuario (int id, String nombre, String apellido, String documento, LocalDate fechaNacimiento, String contraseña, String mail, int rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.contraseña = contraseña;
        this.mail = mail;
        this.rol = rol;
    }

    // Métodos login y logout
    public void login() {
        System.out.println(nombre + " ha iniciado sesión.");
    }

    public void logout() {
        System.out.println(nombre + " ha cerrado sesión.");
    }

    //*Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
    public int getRol() { return rol; }
    public void setRol(int rol) { this.rol = rol; }
}