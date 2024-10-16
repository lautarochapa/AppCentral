package modelo;


// Nico

public class Turno {

    private Date fecha;
    private String hora;
    private String estado;
    private int calificacion;


    private Doctor doctor;
    private Sucursal sucursal;
    private Consultorio consultorio;
    private Paciente paciente;


    public Turno(Date fecha, String hora, String estado, int calificacion,
                 Doctor doctor, Sucursal sucursal, Consultorio consultorio, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.calificacion = calificacion;
        this.doctor = doctor;
        this.sucursal = sucursal;
        this.consultorio = consultorio;
        this.paciente = paciente;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
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

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public void mostrarTurno() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Estado: " + estado);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Doctor: " + doctor.getNombre());
        System.out.println("Sucursal: " + sucursal.getNombre());
        System.out.println("Consultorio: " + consultorio.getNumero());
        System.out.println("Paciente: " + paciente.getNombre());
    }

}
