package es.medac.ProyectoInterfaces;
/**
 * @author Michael Santiago Jara Castro DAW º1
 */
public class Empleado_Recibo extends EmpleadoPrincipal{
    /**
     * Esta clase
     */
    //Atri
    private String recibo;
    //Cons
    public Empleado_Recibo(){
        super();
        this.recibo = "N/A";
    }
    public Empleado_Recibo(String name, String lastname, String dnii, String address, int age, String academyLevel, int expYears, int hoursWorked, int paymentsByHour, String receipt){
        super(name, lastname, dnii, address, age, academyLevel, expYears, hoursWorked, paymentsByHour);
        this.recibo = receipt;
    }
    //Getter
    public String getRecibo(){
        return this.recibo;
    }
    //Setter
    public void setRecibo(String receipt){
        this.recibo = receipt;
    }
    //Metodos
    /**
     * Las horas extras son consideradas extras despues de 160H Mensuales(40 semanales)
     * @return regresa las horas consideradas como extras
     */
    @Override
    public int cantHorasExtras(){
        if(super.getHorasTrabajadas() > 40*4){
            return super.getHorasTrabajadas() - 40*4;
        } else{
            return 0;
        }
    }
    /**
     * Imprime el informe del trabajador
     * @return regresa un string con toda la informacion del trabajador
     */
    @Override
    public String imprimirReciboPago() {
        return "INFORME DEL TRABAJADOR" + "\n"
        + "----------------------" + "\n"
        + "                      " + "\n"
        + "Datos del Empleado" + "\n"
        + "Nombres: " + super.getNombre() + "\n"
        + "Apellidos: " + super.getApellido() + "\n"
        + "DNI: " + super.getDni() + "\n"
        + "Edad: " + super.getEdad() + "\n"
        + "Dirección: " + super.getDireccion() + "\n"
        + "Formación Academica: " + super.getFormacionAcademica() + "\n"
        + "Años de experiencia: " + super.getAñosExperiencia() + "\n"
        + "                      " + "\n"
        + "Resumen de Pago " +this.recibo+ "\n"
        + "Sueldo Bruto: S/ " + sueldoBruto() + "\n"
        + "Horas Extras: " + cantHorasExtras() + "\n"
        + "Pago por horas Extras: S/ " + horasExtras() + "\n"
        + "Sueldo Neto: S/ " + sueldoNeto();
    }
    @Override
    public int horasExtras() {
        return cantHorasExtras()*(super.getPagosPorHoras()*2);
    }
    @Override
    public double sueldoBruto() {
       return super.getHorasTrabajadas()*super.getPagosPorHoras();
    }
    @Override
    public double sueldoNeto() {
        return sueldoBruto()+horasExtras();
    }
}
