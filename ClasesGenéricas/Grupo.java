package ClasesGenéricas;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo {
    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<Alumno>();
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public Iterator iterator(){
        return alumnos.iterator();
    }

    private class iterarGrupo implements Iterator<Alumno>{
        private int posicion;

        @Override
        public boolean hasNext() {
            /*
            While(posicion < alumnos.size() && alumnos.get(posicion).getSituacionAcademica() == SituacionAcademica.BAJA){
                posicion++;
                
             */
            return posicion < alumnos.size();
        }

        @Override
        public Alumno next() {
            return alumnos.get(posicion++);
        }



    }
}
