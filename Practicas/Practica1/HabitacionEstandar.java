public class HabitacionEstandar extends Habitacion{
    /* In this part of the code of this class, we can observe the
      * encapsulation of the information as the type attribute
      * boolean hasWiFi has the access restriction "Private" this for
      * that no method of another class can use these attributes
      * only those of HbaitacionStandard
     */
    private boolean tieneWiFi;

    /*In this part of the class, we can see that the inheritance exists, that is, DoubleRoom
      * inherits the attributes "number" and "pricePerNight" from the Room class and only
      * added a "hasWiFi" attribute. Also, next to the name of this class
      * there is a keyword "extends" that says it inherits from Room
      */

    public HabitacionEstandar(int numero, double precioPorNoche, int noNoches, boolean tieneWiFi) {
        super(numero, precioPorNoche, noNoches);
        this.tieneWiFi = tieneWiFi;
    }

    public boolean isTieneWiFi() {
        return tieneWiFi;
    }

    /* On the other hand, two methods of the parent class are overridden (@Override)
     * one to complement the information of each room and the other to
     * calculate the total cost per number of given nights
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Cuenta con wifi? " + (tieneWiFi ? "Si" : "No"));
    }

    @Override
    public void calcularCostos() {
        super.calcularCostos();
    }

    
}
