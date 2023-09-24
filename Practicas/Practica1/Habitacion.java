public class Habitacion {
    /* En esta parte del código de esta clase, podemos observar el 
     * encapsulamiento de la información ya que los atributos numero y
     * precioPorNoche tienen la restricción de acceso "Private" esto para 
     * que ninguna método de otra clase pueda utilizar estos atributos
     * únicamente los de Habitación
    */
    private int numero;
    private double precioPorNoche;
    private int noNoches;
    public Habitacion(int numero, double precioPorNoche, int noNoches) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
        this.noNoches = noNoches;
    }
    public int getNumero() {
        return numero;
    }
    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
    public int getNoNoches() {
        return noNoches;
    }
    /*Estos dos métodos van a servir para reescribirlos en las clases hijas */
    public void mostrarInformacion(){
        System.out.println("Número de habitación: " + numero);
        System.out.println("Número de noches: " + noNoches);
        System.out.println("Precio por noche: $" + precioPorNoche);
    }

    public void calcularCostos(){
            System.out.println("Costo total: " + (noNoches * precioPorNoche));
    }
}
