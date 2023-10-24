package ClasesGenéricas;

public class Alumno implements Comparable<Alumno>{
    private int noCuenta;
    private String nombre;
    private String apellido;
    private double altura;
    private SituacionAcademica situacionAcademica;
    
    

    public Alumno(int noCuenta, String nombre, String apellido, double altura, SituacionAcademica situacionAcademica) {
        this.noCuenta = noCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.situacionAcademica = situacionAcademica;
    }

    

    public Alumno(int noCuenta, String nombre) {
        this.noCuenta = noCuenta;
        this.nombre = nombre;
    }



    public int getNoCuenta() {
        return noCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getAltura() {
        return altura;
    }

    public SituacionAcademica getSituacionAcademica() {
        return situacionAcademica;
    }

    public void setSituacionAcademica(SituacionAcademica situacionAcademica) {
        this.situacionAcademica = situacionAcademica;
    }

    



    @Override
    public String toString() {
        return "Alumno [noCuenta=" + noCuenta + ", nombre=" + nombre + ", apellido=" + apellido + ", altura=" + altura
                + ", situacionAcademica=" + situacionAcademica + "]";
    }



    @Override
    public int compareTo(Alumno o) {
        if (this.noCuenta < o.noCuenta) {
            return -1;
        } else if (this.noCuenta > o.noCuenta) {
            return 1;
        } else {
            return 0;
        }
    }
}
