package ClasesGenéricas;

public class Principal {
    public static void main(String[] args) {
        Caja<String> caja1 = new Caja<String>();
        caja1.setArticulo("Hola");
        System.out.println("Caja con " + caja1.getArticulo());

        Caja<Integer> caja2 = new Caja<Integer>();
        caja2.setArticulo(123);
        System.out.println("Caja con " + caja2.getArticulo());

        Caja<Alumno> caja3 = new Caja<Alumno>();
        Alumno alumno1 = new Alumno(123, "Juan");
        caja3.setArticulo(alumno1);

        System.out.println("Caja con " + caja3.getArticulo().toString());
    }
}
 /* */