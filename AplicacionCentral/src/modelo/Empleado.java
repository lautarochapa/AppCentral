package modelo;

import java.time.LocalDate;
import java.util.List;


// version agus
public class Empleado extends Usuario {

    // Atributos privados
    private List<Sucursal> sucursales;
    private List<Horario> horarios;

    // Constructor
    public Empleado(int id, String nombre, String apellido, String documento, 
                    LocalDate fechaNacimiento, String contraseña, String mail, int rol, 
                    List<Sucursal> sucursales, List<Horario> horarios) {
        super(id, nombre, apellido, documento, fechaNacimiento, contraseña, mail, rol);
        this.sucursales = sucursales;
        this.horarios = horarios;
    }

    // Getters y Setters
    public List<Sucursal> getSucursales() {return sucursales;}
    public void setSucursales(List<Sucursal> sucursales) { this.sucursales = sucursales;}
    public List<Horario> getHorarios() { return horarios; }
    public void setHorarios(List<Horario> horarios) { this.horarios = horarios;}

}


/*
 * 
 * 
 * VERSION MARCE
 * 
 * 
 * public class empleado {
    private int id;
    private String nombre;
    private String puesto;

    public empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + "]";
    }
}

 * 
 * 
 */