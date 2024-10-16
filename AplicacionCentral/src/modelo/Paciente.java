package modelo;

import java.util.List;


//Ariel

public class Paciente {
    // Variables de instancia
    private HistoriaClinica historiaClinica;
    private List<Turno> turnos;
    private String sexo;

    // Constructor
    public Paciente(HistoriaClinica historiaClinica, List<Turno> turnos, String sexo) {
        this.historiaClinica = historiaClinica;
        this.turnos = turnos;
        this.sexo = sexo;
    }

    // Getters y Setters

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Métodos

    public HistoriaClinica consultarHistorialClinico() {
        return this.historiaClinica;
    }

    public List<Turno> consultarTurnos() {
        return this.turnos;
    }

    public List<OrdenMedica> consultarOrdenes() {
        return this.historiaClinica.getOrdenesMedicas();
    }

    public List<Receta> consultarRecetas() {
        return this.historiaClinica.getRecetas();
    }

    public List<IndicacionMedica> consultarIndicaciones() {
        return this.historiaClinica.getIndicaciones();
    }

    public void calificar(int puntuacion) {}

}
