package modelo;

import java.time.LocalDate;
import java.util.List;


// Agus

public class Doctor extends Empleado {

    // Atributos privados
    private String  matricula;
    private List<Especialidad> especialidades;
    private List<Consultorio> Consultorio;
    private List<Turno> turno;

    // Constructor
    public Doctor(int id, String nombre, String apellido, String documento, 
                  LocalDate fechaNacimiento, String contraseña, String mail, int rol, 
                  List<Sucursal> sucursales, List<Horario> horarios, 
                  List<Especialidad> especialidades, double calificacion) {
        super(id, nombre, apellido, documento, fechaNacimiento, contraseña, mail, rol, sucursales, horarios);
        this.especialidades = especialidades;
    }

 // Métodos ABM para Diagnostico, Sintoma, Orden_De_Estudio, Receta, Tratamiento

    // 1. Agregar Diagnostico
    public void agregarDiagnostico(Diagnostico diagnostico, List<Diagnostico> diagnosticos) {
        diagnosticos.add(diagnostico);
    }

    // 2. Eliminar Diagnostico
    public void eliminarDiagnostico(Diagnostico diagnostico, List<Diagnostico> diagnosticos) {
        diagnosticos.remove(diagnostico);
    }

    // 3. Modificar Diagnostico
    public void modificarDiagnostico(Diagnostico diagnostico, String nuevoDetalle) {
        diagnostico.setDetalle(nuevoDetalle);
    }

    // 4. Agregar Sintoma
    public void agregarSintoma(Sintoma sintoma, List<Sintoma> sintomas) {
        sintomas.add(sintoma);
    }

    // 5. Eliminar Sintoma
    public void eliminarSintoma(Sintoma sintoma, List<Sintoma> sintomas) {
        sintomas.remove(sintoma);
    }

    // 6. Modificar Sintoma
    public void modificarSintoma(Sintoma sintoma, String nuevaDescripcion) {
        sintoma.setDescripcion(nuevaDescripcion);
    }

    // 7. Agregar Orden_De_Estudio
    public void agregarOrdenDeEstudio(Orden_De_Estudio ordenDeEstudio, List<Orden_De_Estudio> ordenes) {
        ordenes.add(ordenDeEstudio);
    }

    // 8. Eliminar Orden_De_Estudio
    public void eliminarOrdenDeEstudio(Orden_De_Estudio ordenDeEstudio, List<Orden_De_Estudio> ordenes) {
        ordenes.remove(ordenDeEstudio);
    }

    // 9. Modificar Orden_De_Estudio
    public void modificarOrdenDeEstudio(Orden_De_Estudio ordenDeEstudio, String nuevoDetalle) {
        ordenDeEstudio.setDetalle(nuevoDetalle);
    }

    // 10. Agregar Receta
    public void agregarReceta(Receta receta, List<Receta> recetas) {
        recetas.add(receta);
    }

    // 11. Eliminar Receta
    public void eliminarReceta(Receta receta, List<Receta> recetas) {
        recetas.remove(receta);
    }

    // 12. Modificar Receta
    public void modificarReceta(Receta receta, String nuevaPrescripcion) {
        receta.setPrescripcion(nuevaPrescripcion);
    }

    // 13. Agregar Tratamiento
    public void agregarTratamiento(Tratamiento tratamiento, List<Tratamiento> tratamientos) {
        tratamientos.add(tratamiento);
    }

    // 14. Eliminar Tratamiento
    public void eliminarTratamiento(Tratamiento tratamiento, List<Tratamiento> tratamientos) {
        tratamientos.remove(tratamiento);
    }

    // 15. Modificar Tratamiento
    public void modificarTratamiento(Tratamiento tratamiento, String nuevoDetalle) {
        tratamiento.setDetalle(nuevoDetalle);
    }

     // Getters y Setters
     public List<Especialidad> getEspecialidades() {  return especialidades;}
     public void setEspecialidades(List<Especialidad> especialidades) {this.especialidades = especialidades; }
     public double getCalificacion() {  return calificacion;  }
     public void setCalificacion(double calificacion) {  this.calificacion = calificacion;}

}
