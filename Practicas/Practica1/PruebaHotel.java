public class PruebaHotel {
    public static void main(String[] args) throws Exception {
        /*Polymorphism can be observed in the creation of objects.
           * For example, in these instances we see that the objects are of type
           * Room, but the class attributes are passed as parameters.
           *Single Room, Double Room Suites, Standard Room,
           * Family and Executive respectively. That is, the Room object
           * can take the form of its child classes
           */
        Habitacion habitacion1 = new HabitacionIndividual(101,120,2,true);
        Habitacion habitacion2 = new HabitacionDoble(202, 180,3, 2);
        Habitacion habitacion3 =  new Suites(126,520,15,4);
        Habitacion habitacion4 = new HabitacionEstandar(145,410,5, true);
        Habitacion habitacion5 = new Familiar(785,600,6,8);
        Habitacion habitacion6 =  new Ejecutiva(103,1000,8,35.2);

        System.out.println("A continuación se muestra la información de las habitaciones disponibles");

        System.out.println("\n--->Habitación Individual<---");
        habitacion1.mostrarInformacion();
        habitacion1.calcularCostos();
        System.out.println("--------------------------");
        System.out.println("--->Habitación Doble<---");
        habitacion2.mostrarInformacion();
        habitacion2.calcularCostos();
        System.out.println("--------------------------");
        System.out.println("--->Suites<---");
        habitacion3.mostrarInformacion();
        habitacion3.calcularCostos();
        System.out.println("--------------------------");
        System.out.println("--->Habitación Estándar<---");
        habitacion4.mostrarInformacion();
        habitacion4.calcularCostos();
        System.out.println("--------------------------");
        System.out.println("--->Familiar<---");
        habitacion5.mostrarInformacion();
        habitacion5.calcularCostos();
        System.out.println("--------------------------");
        System.out.println("--->Ejecutiva<---");
        habitacion6.mostrarInformacion();
        habitacion6.calcularCostos();
    }
}
