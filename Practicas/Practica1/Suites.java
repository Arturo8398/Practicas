public class Suites extends Habitacion{
    /* In this part of the code of this class, we can observe the
      * encapsulation of the information as the type attribute
      * int numberOfInhabitants has the access restriction "Private" this for
      * that no method of another class can use these attributes
      * only those of Suites
     */
    private int numeroDeHabitaciones;

    /*In this part of the class, we can see that there is inheritance, i.e. Suites
      * inherits the attributes "number" and "pricePerNight" from the Room class and only
      * an attribute "numberOfRooms" is added. Also, next to the name of this class
      * there is a keyword "extends" that says it inherits from Room
      */

    public Suites(int numero, double precioPorNoche, int noNoches, int numeroDeHabitaciones) {
        super(numero, precioPorNoche, noNoches);
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public int getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }

    /* On the other hand, two methods of the parent class are overridden (@Override)
     * one to complement the information of each room and the other to
     * calculate the total cost per number of given nights
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de habitaciones: " + numeroDeHabitaciones);
    }

    @Override
    public void calcularCostos() {
        super.calcularCostos();
    }    
}
