package modelo;


public class Tratamiento {
    // Nicolás Auger

    private int periodicidad;
    private int duracion;
    private String cantidad;

    private Paciente paciente;
    private Doctor doctor;
    private Sucursal sucursal;

    public Tratamiento(int periodicidad, int duracion, String cantidad,
                       Paciente paciente, Doctor doctor, Sucursal sucursal) {
        this.periodicidad = periodicidad;
        this.duracion = duracion;
        this.cantidad = cantidad;
        this.paciente = paciente;
        this.doctor = doctor;
        this.sucursal = sucursal;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "periodicidad=" + periodicidad +
                ", duracion=" + duracion +
                ", cantidad='" + cantidad + '\'' +
                ", paciente=" + paciente.getNombre() +
                ", doctor=" + doctor.getNombre() +
                ", sucursal=" + sucursal.getNombre() +
                '}';
    }
}

