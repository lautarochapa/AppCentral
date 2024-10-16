package modelo;


// VERSION MARIANO
public class Consultorio {
    int id_consultorio;
    int piso;
    int box;
    Sucursal sucursal;
    Doctor list; // no se usar lista. je

    public Consultorio(int id_consultorio, int piso, int box, Sucursal sucursal, Doctor doctor) {

        this.id_consultorio = id_consultorio;
        this.piso = piso;
        this.box = box;
        this.sucursal = sucursal;
        this.doctor = doctor;
    }
    // Getters
    public int getIdConsultorio() {
        return id_consultorio;
    }

    public int getPiso() {
        return piso;
    }

    public int getBox() {
        return box;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    // Setters
    public void setIdConsultorio(int id_consultorio) {
        this.id_consultorio = id_consultorio;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Consultorio{" +
               "id_consultorio=" + id_consultorio +
               ", piso=" + piso +
               ", box=" + box +
               ", sucursal=" + sucursal +
               ", doctor=" + doctor +
               '}';
    }
}




/*
 * VERSION MARCE
 * 
 * 
 * public class consultorio {
    private int id;
    private String nombre;
    private String ubicacion;

    public consultorio(int id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    @Override
    public String toString() {
        return "Consultorio [ID=" + id + ", Nombre=" + nombre + ", Ubicación=" + ubicacion + "]";
    }
}

 * 
 */