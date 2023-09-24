package Tareas.Polimorfismo.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        // Create instances of the Character class but of the child classes
        Personaje inicio = new Personaje();

        Personaje enemigo1 = new Enemigo("Goku", 100, "Esqueleto");
        Personaje enemigo2 = new Enemigo("Vegeta", 99, "Orco");
        Personaje enemigo3 = new Enemigo("Picoro", 85, "Dragón");

        Personaje jugador1 = new Jugador("Freezer", 76, "Guerrero");
        Personaje jugador2 = new Jugador("Numero 17", 100, "Mago");
        Personaje jugador4 = new Jugador("Bills", 105, "Guerrero");

        inicio.atacar();
        // We can choose whether to be the enemy or the player
        System.out.println("¿A quién eliges?");
        System.out.println("1. Bills");
        System.out.println("2. Goku");
        System.out.println("3. Vegeta");
        System.out.println("4. Picoro");
        System.out.println("5. Freezer");
        System.out.println("6. Numero 17");
        System.out.print("Opción: ");
        opcion = entrada.nextInt();
        System.out.println();
        // I added a switch to be able to choose between the characters to "play"
        switch (opcion) {
            case 1:
                System.out.println("Ahora eres el bueno");
                System.out.println("Tu nivel es de " + jugador4.getNivel());
                System.out.print("Bills: ");
                jugador4.usarHabilidadEspecial();
                break;
            case 2:
                System.out.println("Ahora eres el enemigo");
                System.out.println("Tu nivel es de " + enemigo1.getNivel());
                System.out.print("Goku: ");
                enemigo1.gritar();
                break;
            case 3:
                System.out.println("Ahora eres el enemigo");
                System.out.println("Tu nivel es de " + enemigo2.getNivel());
                System.out.print("Vegeta: ");
                enemigo2.gritar();
                break;
            case 4:
                System.out.println("Ahora eres el enemigo");
                System.out.println("Tu nivel es de " + enemigo3.getNivel());
                System.out.print("Picoro: ");
                enemigo3.gritar();
                break;
            case 5:
                System.out.println("Ahora eres el bueno");
                System.out.println("Tu nivel es de " + jugador1.getNivel());
                System.out.print("Freezer: ");
                jugador1.usarHabilidadEspecial();
                break;
            case 6:
                System.out.println("Ahora eres el bueno");
                System.out.println("Tu nivel es de " + jugador2.getNivel());
                System.out.print("Numero 17: ");
                jugador2.usarHabilidadEspecial();
                break;
            default:
                System.out.println("Opci+on incorrecta");
                break;
        }
    }
}
