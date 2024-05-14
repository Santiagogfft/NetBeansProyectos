package es.medac.ProyectoInterfaces;
/**
 * @author Michael Santiago Jara Castro DAW º1
 * @version 1.0
 */
public abstract class EmpleadoPrincipal {
    //Atri
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int edad;
    private String formacionAcademica;
    private int añosExperiencia;
    private int horasTrabajadas;
    private int pagosPorHora;
    //Cons
    public EmpleadoPrincipal(){
        this.nombre = "N/A";
        this.apellido = "N/A";
        this.dni = "N/A";
        this.direccion = "N/A";
        this.edad = 0;
        this.formacionAcademica = "N/A";
        this.añosExperiencia = 0;
        this.horasTrabajadas = 0;
        this.pagosPorHora = 0;
    }
    public EmpleadoPrincipal(String name, String lastname, String dnii, String address, int age, String academyLevel, int expYears, int hoursWorked, int paymentsByHour){
        this.nombre = name;
        this.apellido = lastname;
        this.dni = dnii;
        this.direccion = address;
        this.edad = age;
        this.formacionAcademica = academyLevel;
        this.añosExperiencia = expYears;
        this.horasTrabajadas = hoursWorked;
        this.pagosPorHora = paymentsByHour;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getDni(){
        return this.dni;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getFormacionAcademica(){
        return this.formacionAcademica;
    }
    public int getAñosExperiencia(){
        return this.añosExperiencia;
    }
    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    public int getPagosPorHoras(){
        return this.pagosPorHora;
    }
    //Setters
    public void setNombre(String name){
        this.nombre = name;
    }
    public void setApellido(String lastname){
        this.apellido = lastname;
    }
    public void setDni(String dnii){
        this.dni = dnii;
    }
    public void setDireccion(String address){
        this.direccion = address;
    }
    public void setEdad(int age){
        this.edad = age;
    }
    public void setFormacionAcademica(String academyLevel){
        this.formacionAcademica = academyLevel;
    }
    public void setAñosExperiencia(int expYears){
        this.añosExperiencia = expYears;
    }
    public void setHorasTrabajadas(int hoursWorked){
        this.horasTrabajadas = hoursWorked;
    }
    public void setPagosPorHora(int paymentsByHour){
        this.pagosPorHora = paymentsByHour;
    }
    //Metodos
    public abstract String imprimirReciboPago();
    public abstract int horasExtras();
    public abstract int cantHorasExtras();
    public abstract double sueldoBruto();
    public abstract double sueldoNeto();
}