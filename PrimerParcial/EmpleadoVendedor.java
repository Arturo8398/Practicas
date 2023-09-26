package PrimerParcial;

public class EmpleadoVendedor extends Empleado{
    private double montoVendido;
    private double tasaComision;
    
    
    public EmpleadoVendedor(String rFC, String apellidos, String nombres, double montoVendido, double tasaComision) {
        super(rFC, apellidos, nombres);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }

    @Override
    public String toString() {
        return "EmpleadoVendedor [montoVendido=" + montoVendido + ", tasaComision=" + tasaComision + "]";
    }

    public double ingresos(){
        double ingreso = montoVendido*tasaComision;
        return ingreso;
    }

    public double bonificacion(){
        double bonificacion = 0;
            if(montoVendido < 1000){
                //System.out.println("No hay bonificación");
                bonificacion = 0;
            }else if(montoVendido >= 1000 && montoVendido <= 5000){
                bonificacion = ingresos()*0.05;
                return bonificacion;
                //System.out.println("Bonificación: " + bonificacion);
                //System.out.println("Monto vendido + bonificación: " + (bonificacion + ingresos()));
            }else if(montoVendido > 5000){
                bonificacion = ingresos() * 0.10;
                return bonificacion;
                //System.out.println("Bonificación: " + bonificacion);
                //System.out.println("Monto vendido + bonificacion: " + (bonificacion + ingresos()));
            }
        return bonificacion;
    }

    @Override
    public double descuentos(){
        double descuento = 0;
        if(ingresos() < 1000){
            descuento = ingresos() * 0.11;
            return descuento;
            //System.out.println("Tu descuento es: " + descuento);
            //System.out.println("Ingresos con descuento: " + (ingresos() - descuento));
        }else{
            descuento = ingresos() * 0.15;
            return descuento;
            //System.out.println("Tu descuento es: " + descuento);
            //System.out.println("Ingresos con descuento: " + (ingresos() - descuento));
        }
    }

    public double sueldoNeto(){
        double sueldoNeto;
        sueldoNeto = ingresos() + bonificacion() - descuentos();
        return sueldoNeto;
    }
}
