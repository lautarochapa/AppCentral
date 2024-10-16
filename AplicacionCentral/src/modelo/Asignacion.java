package modelo;

// VICTORIA VAZQUEZ

public class Asignacion {
    private String dia;
    private Horario horario;
    private Consultorio consultorio;
    private Doctor doctor;

    public Asignacion(){}

    public Asignacion(String dia, Horario horario, Consultorio consultorio, Doctor doctor){
        this.dia = dia;
        this.horario = horario;
        this.consultorio = consultorio;
        this.doctor = doctor;
    }

}

//Setters

public void setDia(String dia){
    this.dia = dia;
}
public void setHorario(Horario horario){
    this.horario = horario;
}
public void setConsultorio(Consultorio consultorio){
    this.consultorio = consultorio;
}
public void setDoctor(Doctor doctor){
    this.doctor = doctor;
}

//Getters

public String getDia(){
    return dia;
}
public Horario getHorario(){
    return horario;
}
public Consultorio getConsultorio(){
    return consultorio;
}
public Doctor getDoctor(){
    return doctor;
}
