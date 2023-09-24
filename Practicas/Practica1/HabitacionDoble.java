public class HabitacionDoble extends Habitacion{
    /* In this part of the code of this class, we can observe the
      * encapsulation of the information as the type attribute
      * int numberOfBeds has the access restriction "Private" this for
      * that no method of another class can use these attributes
      * only those of Double Room
     */
    private int numeroDeCamas;

    /*In this part of the class, we can see that the inheritance exists, that is, DoubleRoom
      * inherits the attributes "number" and "pricePerNight" from the Room class and only
      * an attribute "numberOfBeds" is added. Also, next to the name of this class
      * there is a keyword "extends" that says it inherits from Room
      */
    public HabitacionDoble(int numero, double precioPorNoche,int noNoches, int numeroDeCamas) {
        super(numero, precioPorNoche, noNoches);
        this.numeroDeCamas = numeroDeCamas;
    }
    
    public int getNumeroDeCamas(){
        return numeroDeCamas;
    }
    /* On the other hand, two methods of the parent class are overridden (@Override)
     * one to complement the information of each room and the other to
     * calculate the total cost per number of given nights
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de camas: " + numeroDeCamas);
    }

    @Override
    public void calcularCostos() {
        super.calcularCostos();
    }
    

}
