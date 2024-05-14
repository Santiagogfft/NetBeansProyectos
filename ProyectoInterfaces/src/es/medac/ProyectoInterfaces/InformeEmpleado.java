package es.medac.ProyectoInterfaces;
/**
 * @author Michael Santiago Jara Castro DAW º1
 */
public class InformeEmpleado extends EmpleadoPrincipal {
    //Atri
    private int cantHijos;
    private String hacienda;
    private String retencion;
    //Cons
    public InformeEmpleado(){
        super();
        this.cantHijos = 0;
        this.hacienda = "Hacienda 1.5%";
        this.retencion = "Retencion 2.5%";
    }
    public InformeEmpleado(String name, String lastname, String dnii, String address, int age, String academyLevel, int expYears, int hoursWorked, int paymentsByHour, int children, String haciendaa, String retencionn){
        super(name, lastname, dnii, address, age, academyLevel, expYears, hoursWorked, paymentsByHour);
        this.cantHijos = children;
        this.hacienda = haciendaa;
        this.retencion = retencionn;
    }
    //Getters
    public int getCantHijos(){
        return this.cantHijos;
    }
    public String getHacienda(){
        return this.hacienda;
    }
    public String getRetencion(){
        return this.retencion;
    }
    //Setters
    public void setCantHijos(int children){
        this.cantHijos = children;
    }
    public void setHacienda(String haciendaa){
        this.hacienda = haciendaa;
    }
    public void setRetencion(String retencionn){
        this.retencion = retencionn;
    }
    //Metodos
    private double pension(){
        if(this.retencion.equals("Retencion 2.5%")){
            return sueldoBruto()*0.025;
        } else if(this.hacienda.equals("Hacienda 1.5%")){
            return sueldoBruto()*0.0015;
        } else {
            return 0;
        }
    }
    private double bonoHijos(){
        if(this.cantHijos >= 1 && this.cantHijos <= 2){
            return sueldoBruto()*0.032;
        } else if(this.cantHijos > 2 && this.cantHijos <= 4){
            return sueldoBruto()*0.05;
        } else if(this.cantHijos >= 5){
            return sueldoBruto()*0.075;
        } else {
            return sueldoBruto()*0.0;
        }
    }
    @Override
    public int horasExtras() {
        return cantHorasExtras()*(super.getPagosPorHoras()*2);
    }
    @Override
    public int cantHorasExtras() {
        if(super.getHorasTrabajadas() > 40*4){
            return super.getHorasTrabajadas() - 40*4;
        } else {
            return 0;
        }
    }
    @Override
    public double sueldoBruto() {
        return super.getHorasTrabajadas()*super.getPagosPorHoras();
    }
    @Override
    public double sueldoNeto() {
            return sueldoBruto()+horasExtras()+bonoHijos();
    }
    @Override
    public String imprimirReciboPago() {
        return "INFORME DEL TRABAJADOR" + "\n" +
        "---------------------" + "\n" +
        "                     "+ "\n" +
        "Datos del Empleado" + "\n" +
        "Nombres: " + super.getNombre()+"\n" +
        "Apellidos: " + super.getApellido()+"\n" +
        "DNI: " + super.getDni()+ "\n" +
        "Edad: " + super.getEdad()+"\n" +
        "Dirección: " + super.getDireccion()+"\n" +
        "Formación Academica: " + super.getFormacionAcademica()+ "\n" +
        "Años de experiencia: " + super.getAñosExperiencia()+ "\n" + " " + "\n" +
        "Resumen de Pago" + "\n" + "                     "+ "\n" +
        "Sueldo Bruto: S/ " + sueldoBruto()+ "\n" +
        "Horas Extras: " + cantHorasExtras() + "\n" +
        "Pago por horas Extras: S/ " + horasExtras() + "\n" +
        "Pension: S/ " + pension()+ "\n" +
        "Bono por hijos: S/ " + bonoHijos()+ "\n" + "Sueldo Neto: S/ " + sueldoNeto();
    }
}
