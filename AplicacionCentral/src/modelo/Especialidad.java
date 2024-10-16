package modelo;

/*
 * clase especialidad Marcelo
 */

 public class Especialidad {
    private String id; // Identificador único para la especialidad
    private String nombre; // Nombre de la especialidad

    public Especialidad(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
