public class Ejecutiva extends Habitacion{
    /* In this part of the code of this class, we can observe the
      * encapsulation of the information as the type attribute
      * double dimensionsInM2 has the access restriction "Private" this for
      * that no method of another class can use these attributes
      * only those of Executive
     */
    private double dimensionesEnM2;
    /*In this part of the class, we can see that the inheritance exists, that is, DoubleRoom
      * inherits the attributes "number" and "pricePerNight" from the Room class and only
      * an attribute "dimensionsInM2" is added. Also, next to the name of this class
      * there is a keyword "extends" that says it inherits from Room
      */
    public Ejecutiva(int numero, double precioPorNoche, int noNoches, double dimensionesEnM2) {
        super(numero, precioPorNoche, noNoches);
        this.dimensionesEnM2 = dimensionesEnM2;
    }

    public double getDimensionesEnM2() {
        return dimensionesEnM2;
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
        System.out.println("Metros cuadrados: " + dimensionesEnM2);
    }

    
}
