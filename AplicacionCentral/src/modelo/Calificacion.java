package modelo;


// Villar
public class Calificacion {

    private String sDescripcion;
    private int iPuntuacion;

    // Constructor
    public  Libro(String sDescripcion, int iPuntuacion) {
        this.sDescripcion = sDescripcion;
        this.iPuntuacion = iPuntuacion;
    }


    // Getters y Setters     
    public String getDescripcion() {
        return sDescripcion;
    }

    public void setDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    public int getPuntuacion() {
        return iPuntuacion;
    }

    public void setPuntuacion(int iPuntuacion) {
        this.iPuntuacion = iPuntuacion;
    }

    //Sobreescritura metodo toString()
    @Override
    public String toString() {
        return "\nDescripcion: " + sDescripcion +
               "\nPuntuacion: " + iPuntuacion; 

    }

    
}
