package com.practicas;

public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, double salario, int horasTrabajadas) throws SalarioInvalidoException{
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        if (salario <= 0) {
            throw new SalarioInvalidoException("El salario no puede ser cero ni un número negativo");
        }
    }

    @Override
    public double calcularSalario(){
        return horasTrabajadas * this.getSalario();
    }    
}
