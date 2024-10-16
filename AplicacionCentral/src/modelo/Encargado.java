package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Marce

public class Encargado {
    private List<consultorio> consultorios = new ArrayList<>();
    private List<empleado> empleados = new ArrayList<>();
    private List<calendario> calendarios = new ArrayList<>();

    // ABM Consultorio
    public void altaConsultorio(consultorio consultorio) {
        consultorios.add(consultorio);
        System.out.println("Consultorio añadido: " + consultorio);
    }

    public void bajaConsultorio(int id) {
        consultorios.removeIf(consultorio -> consultorio.getId() == id);
        System.out.println("Consultorio con ID " + id + " eliminado.");
    }

    public void modificarConsultorio(int id, String nuevoNombre, String nuevaUbicacion) {
        for (consultorio consultorio : consultorios) {
            if (consultorio.getId() == id) {
                consultorio.setNombre(nuevoNombre);
                consultorio.setUbicacion(nuevaUbicacion);
                System.out.println("Consultorio modificado: " + consultorio);
                break;
            }
        }
    }

    
    public void altaEmpleado(empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado añadido: " + empleado);
    }

    public void bajaEmpleado(int id) {
        empleados.removeIf(empleado -> empleado.getId() == id);
        System.out.println("Empleado con ID " + id + " eliminado.");
    }

    public void modificarEmpleado(int id, String nuevoNombre, String nuevoPuesto) {
        for (empleado empleado : empleados) {
            if (empleado.getId() == id) {
                empleado.setNombre(nuevoNombre);
                empleado.setPuesto(nuevoPuesto);
                System.out.println("Empleado modificado: " + empleado);
                break;
            }
        }
    }

    
    public void altaCalendario(calendario calendario) {
        calendarios.add(calendario);
        System.out.println("Evento añadido al calendario: " + calendario);
    }

    public void bajaCalendario(int id) {
        calendarios.removeIf(calendario -> calendario.getId() == id);
        System.out.println("Evento con ID " + id + " eliminado.");
    }

    public void modificarCalendario(int id, Date nuevaFecha, String nuevoEvento) {
        for (calendario calendario : calendarios) {
            if (calendario.getId() == id) {
                calendario.setFecha(nuevaFecha);
                calendario.setEvento(nuevoEvento);
                System.out.println("Evento modificado en el calendario: " + calendario);
                break;
            }
        }
    }

   
    public static void main(String[] args) {
        encargado encargado = new encargado();

        
        consultorio consultorio1 = new consultorio(1, "Consultorio Central", "Calle 123");
        encargado.altaConsultorio(consultorio1);
        encargado.modificarConsultorio(1, "Consultorio Norte", "Avenida Siempre Viva");
        encargado.bajaConsultorio(1);

        
        empleado empleado1 = new empleado(1, "Juan Perez", "Médico");
        encargado.altaEmpleado(empleado1);
        encargado.modificarEmpleado(1, "Juan Pérez", "Director");
        encargado.bajaEmpleado(1);

        
        calendario calendario1 = new calendario(1, new Date(), "Reunión de equipo");
        encargado.altaCalendario(calendario1);
        encargado.modificarCalendario(1, new Date(), "Reunión de planificación");
        encargado.bajaCalendario(1);
    }
}

