package modelo;

/*AGUSTIN */
public class Sucursal {
    // Atributos privados
    private int id;
    private String nombre;
    private Direccion direccion;
    private List<Consultorio> consultorios;
    private List<Especialidad> especialidades;
    private Horario horario;
// Constructor
    public Sucursal(int id, String nombre, Direccion direccion, List<Consultorio> consultorios, 
                    List<Especialidad> especialidades, Horario horarios) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.consultorios = consultorios;
        this.especialidades = especialidades;
        this.horario = horario;
    }
// Getters y Setters
    public int getId() {   return id;}
    public void setId(int id) {    this.id = id; }
    public String getNombre() {    return nombre;}
    public void setNombre(String nombre) {    this.nombre = nombre; }
    public Direccion getDireccion() {    return direccion; }
    public void setDireccion(Direccion direccion) {    this.direccion = direccion;}
    public List<Consultorio> getConsultorios() {    return consultorios;}
    public void setConsultorios(List<Consultorio> consultorios) {    this.consultorios = consultorios; }
    public List<Especialidad> getEspecialidades() {    return especialidades;}
    public void setEspecialidades(List<Especialidad> especialidades) {     this.especialidades = especialidades; }
    public Horario getHorarios() {    return horario;}
    public void setHorarios(Horario horarios) {    this.horario = horario;}
}
