package PrimerParcial;

public class EmpleadoPermanente extends Empleado{
    private double sueldoBase;
    private int noSeguroSocial;
    

    public EmpleadoPermanente(String rfc, String apellidos, String nombres, double sueldoBase, int noSeguroSocial) {
        super(rfc, apellidos, nombres);
        this.sueldoBase = sueldoBase;
        this.noSeguroSocial = noSeguroSocial;
    }

    
    public double ingresos(){
        return sueldoBase;
    }


    @Override
    public double descuentos() {
        double descuento = 0;
        if(noSeguroSocial != 0){
            descuento = sueldoBase *  0.11;
            return descuento;
        }
        return descuento;
    }


    @Override
    public double sueldoNeto(){
        double sueldo = ingresos() - descuentos();
        return sueldo;
    }
    
}
