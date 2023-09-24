package Practicas.Practica2;

public class Main {

    public static void main(String[] args) throws SalarioInvalidoException {
        Empleado [] empleados = new Empleado[8];
        try {
            Empleado empleado1 =  new EmpleadoPorHora("Arturo", 236, 5);
            empleados[0] = empleado1;
            EmpleadoAsalariado empleado2 =  new EmpleadoAsalariado("Evelin", 96, 15, 7);
            empleados[1] = empleado2;
            Empleado empleado3 =  new EmpleadoPorHora("Diana", 45, 6);
            empleados[2] = empleado3;
            EmpleadoAsalariado empleado4 =  new EmpleadoAsalariado("Edgar", 45, 36, 8);
            empleados[3] = empleado4;
            Empleado empleado5 =  new EmpleadoPorHora("Jorge", 196, 5);
            empleados[4] = empleado5;
            EmpleadoAsalariado empleado6 =  new EmpleadoAsalariado("Adriana", 96, 12, 9);
            empleados[5] = empleado6;
            Empleado empleado7 =  new EmpleadoPorHora("Maricarmen", 85, 5);
            empleados[6] = empleado7;
            EmpleadoAsalariado empleado8 =  new EmpleadoAsalariado("Vanessa", 74, 34, 10);
            empleados[7] = empleado8;

            for (int i = 0; i < empleados.length; i++) {
                System.out.println("Salario del empleado " + (i + 1) + " $" + empleados[i].calcularSalario());
            }
        } catch (SalarioInvalidoException e) {
            System.out.println("El salario que ingresaste es inválido");
        }
        
    }
}
