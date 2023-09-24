package Tareas.Herencia;
//this class inherits from FiguraGeometrica
public class Rectangulo extends FiguraGeometrica{
    private double ladoMay;
    private double ladoMen;
    public Rectangulo(String nombre, double ladoMay, double ladoMen) {
        super(nombre);
        this.ladoMay = ladoMay;
        this.ladoMen = ladoMen;
    }
    //get and set methods of each attribute
    public double getLadoMay() {
        return ladoMay;
    }
    public void setLadoMay(double ladoMay) {
        this.ladoMay = ladoMay;
    }
    public double getLadoMen() {
        return ladoMen;
    }
    public void setLadoMen(double ladoMen) {
        this.ladoMen = ladoMen;
    }
    //override superclass method calcularArea()
    public void calcularArea(){
        area = ladoMay * ladoMen;
        System.out.println("El área del rectángulo es: " + area);
    }
}
