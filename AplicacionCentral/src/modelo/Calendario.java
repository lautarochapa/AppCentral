package modelo;

import java.util.Date;


// Marce
public class Calendario {
    private int id;
    private Date fecha;
    private String evento;

    public Calendario(int id, Date fecha, String evento) {
        this.id = id;
        this.fecha = fecha;
        this.evento = evento;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getEvento() { return evento; }
    public void setEvento(String evento) { this.evento = evento; }

    @Override
    public String toString() {
        return "Calendario [ID=" + id + ", Fecha=" + fecha + ", Evento=" + evento + "]";
    }
}
