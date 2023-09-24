public class Familiar extends Habitacion{
    /* In this part of the code of this class, we can observe the
      * encapsulation of the information as the type attribute
      * int capacityPeople has the access restriction "Private" this for
      * that no method of another class can use these attributes
      * only those of Family
     */
    private int capacidadPersonas;

    /*In this part of the class, we can see that the inheritance exists, that is, DoubleRoom
      * inherits the attributes "number" and "pricePerNight" from the Room class and only
      * a "capacityPeople" attribute is added. Also, next to the name of this class
      * there is a keyword "extends" that says it inherits from Room
      */

    public Familiar(int numero, double precioPorNoche, int noNoches, int capacidadPersonas) {
        super(numero, precioPorNoche, noNoches);
        this.capacidadPersonas = capacidadPersonas;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }
    /* On the other hand, two methods of the parent class are overridden (@Override)
     * one to complement the information of each room and the other to
     * calculate the total cost per number of given nights
     */
    @Override
    public void calcularCostos() {
        super.calcularCostos();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad personas: " + capacidadPersonas);
    }

    
}
