package PrimerParcial;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoVendedor("HFKDK34", "GARCIA LOPEZ", "ARTURO", 456.22, 4569.2);
        Empleado empleado2 = new EmpleadoVendedor("JDDKKH4", "CRUZ LOPEZ", "EVELIN", 4856.2, 4562.2);
        Empleado empleado3 = new EmpleadoVendedor("HDJKS4", "RODRIGUEZ RODRIGUEZ", "EDGAR", 4586.2, 1526.3);

        Empleado empleado4 =  new EmpleadoPermanente("JKLOGH6", "GARCIA GARCIA", "JULIO", 1568.2, 1526);
        Empleado empleado5 = new EmpleadoPermanente("HFKDLJ6", "GARCIA AGUILAR", "JULIO CESAR", 1521.3, 1426);
        Empleado empleado6 = new EmpleadoPermanente("JKODH7", "GARCIA LÓPEZ", "COSETTE", 1562.1, 1586);

        empleado1.descuentos();
        empleado1.sueldoNeto();
        empleado4.descuentos();
        empleado4.sueldoNeto();

        Empleado[] planta = new Empleado[6];
        planta[0] = empleado1;
        planta[1] = empleado2;
        planta[2] = empleado3;
        planta[3] = empleado4;
        planta[4] = empleado5;
        planta[5] = empleado6;
        double sueldoPlanta = 0;
        for (Empleado empleado : planta) {
            sueldoPlanta += empleado.sueldoNeto();
        }

        System.out.println("Planta: " + sueldoPlanta);
    }


}
