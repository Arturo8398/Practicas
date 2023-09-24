package Tareas.Herencia.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        //Creating player instance
        Personaje inicio = new Personaje();

        Jugador jugador1 = new Jugador("Goku", 95, "Guerrero");

        Enemigo enemigo1 =  new Enemigo("Bills", 110, "Esqueleto");

        inicio.atacar();
        //We can choose whether to be the enemy or the player
        System.out.println("¿A quién eliges?");
        System.out.println("1. Bills");
        System.out.println("2. Goku");
        System.out.print("Opción: ");
        opcion = entrada.nextInt();
        System.out.println();
        //I modified this part a bit to make it a bit interactive
        if (opcion == 1) {
            System.out.println("Ahora eres el enemigo");
            System.out.println("Tu nivel es de " + enemigo1.getNivel());
            System.out.print("Bills: ");
            enemigo1.gritar();
            System.out.print("Goku: ");
            jugador1.usarHabilidadEspecial();
        } else {
            System.out.println("Ahora eres el bueno");
            System.out.println("Tu nivel es de " + jugador1.getNivel());
            System.out.print("Goku: ");
            jugador1.usarHabilidadEspecial();
            System.out.print("Bills: ");
            enemigo1.gritar();
            
        }
    }
}
