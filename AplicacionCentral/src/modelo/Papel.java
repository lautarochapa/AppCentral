package modelo;

import java.util.Date;


// javier
public class Papel {
    
    private int id;
    private Doctor doctor;
    private Date fecha;
    private Paciente paciente;

    public Papel(int id, Doctor doctor, Date fecha, Paciente paciente) {
        this.id = id;
        this.doctor = doctor;
        this.fecha = fecha;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}

