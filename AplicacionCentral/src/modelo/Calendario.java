package modelo;

import java.util.Date;


// Marce
public class Calendario {
    private List<Asignacion> asignaciones;

    public Calendario(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    // Getters y Setters
    public int getAsignaciones() { 
        return asignaciones; 
    }
    public void setAsignaciones(List<Asignacion> asignaciones) { 
        this.asignaciones = asignaciones; 
    }



}


//

Asignacion 1 
            viernes
            19 ho
            consultorio 10
            Juan


Asignacion 2
        martes
        19 ho
        consultorio 10
        Juan


Asignacion 3 
            miercoles
            19 ho
            consultorio 10
            Juan


            
Asignacion asig1 = new Asignacion("lunes")
Asignacion asig2 = new Asignacion("lunes")
Asignacion asig3 = new Asignacion("lunes")



List<Asignacion> lista = new List<Asignacion>(asig1, asig2, asig3);

Calendario calend1 = new Calendario(lista);

calend1.removeAsignacion(asign3);

calend1.addAsign(asign4);

calend1.getAsignacionesporDia("Lunes") -->> devuelva todo lo que coincide con ese dia... --> SELECT ^FROM WHERE DIA = "LUNES"


asig1.setDia("viernes"); ???? esto impacta sobre la lista???? 

