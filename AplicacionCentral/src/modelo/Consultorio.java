package modelo;

import java.util.ArrayList;

// VERSION MARIANO
public class Consultorio {

    private int id_consultorio;
    private int piso;
    private int box;
    private Sucursal sucursal;
    private ArrayList<Doctor> doctores; 



    public Consultorio(){

    }


    public Consultorio(int id_consultorio, int piso, int box, Sucursal sucursal, ArrayList<Doctor> doctores) {

        this.id_consultorio = id_consultorio;
        this.piso = piso;
        this.box = box;
        this.sucursal = sucursal;
        this.doctores = doctores;
    }

    
    public Consultorio(int id_consultorio, int piso, int box, Sucursal sucursal) {

        this.id_consultorio = id_consultorio;
        this.piso = piso;
        this.box = box;
        this.sucursal = sucursal;
    }



    // Getters
    public int getIdConsultorio() {
        return id_consultorio;
    }

    public int getPiso() {
        return piso;
    }

    public int getBox() {
        return box;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    // Setters
    public void setIdConsultorio(int id_consultorio) {
        this.id_consultorio = id_consultorio;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }



    //metodos auxiliares

    public void addDoctor(Doctor doc){
        this.doctores.add(doc);
    }

    public void removeDoctor(Doctor doc){
        this.doctores.remove(doc);
    }

    public Doctor buscarDoctorPorId(int id){

        for (Doctor doctor : doctores) {
            if(doctor.getId() == id){
                return doctor;
            }
        }
        return null;
    }




    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Consultorio{" +
               "id_consultorio=" + id_consultorio +
               ", piso=" + piso +
               ", box=" + box +
               ", sucursal=" + sucursal +
               ", doctor=" + doctores +
               '}';
    }
}









/*
 * VERSION MARCE
 * 
 * 
 * public class consultorio {
    private int id;
    private String nombre;
    private String ubicacion;

    public consultorio(int id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    @Override
    public String toString() {
        return "Consultorio [ID=" + id + ", Nombre=" + nombre + ", Ubicación=" + ubicacion + "]";
    }
}

 * 
 */