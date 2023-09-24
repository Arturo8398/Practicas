package com.practicas;

public class EmpleadoAsalariado extends Empleado implements Bonificable {
    private int diasTrabajados;
    private int diasPagadosExtras;

    public EmpleadoAsalariado(String nombre, double salario, int diasTrabajados, int diasPagadosExtras) throws SalarioInvalidoException {
        super(nombre, salario);
        this.diasTrabajados = diasTrabajados;
        this.diasPagadosExtras = diasPagadosExtras;
        if (salario <= 0) {
            throw new SalarioInvalidoException("El salario no puede ser cero ni un número negativo");
        }
    }

    @Override
    public double calcularSalario() {
        return diasTrabajados * this.getSalario();
    }

    @Override
    public double calcularBonificacion() {
        return diasPagadosExtras * this.getSalario();
    }

}

class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException(String mensaje) {
        super(mensaje);
    }
}
