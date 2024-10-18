package modelo;

// ALE
public class Receta{
   
    
    private String droga;
    private String formato;
    private Diagnostico diagnostico;
    private Tratamiento tratamiento;


    public Receta(String droga, String formato, Diagnostico diagnostico, Tratamiento tratamiento) {
        this.droga = droga;
        this.formato = formato;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public void setDroga(String droga) {
        this.droga = droga;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
}