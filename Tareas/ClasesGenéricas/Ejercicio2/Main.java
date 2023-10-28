package Tareas.ClasesGenéricas.Ejercicio2;

import java.util.Scanner;

public class Main {
    static int nivel, opcion, opcionLetra, enemigo_jugador;
    static String nombre, tipo, clase;
    static Scanner entrada = new Scanner(System.in);

    // Create instances of the Character class but of the child classes
    static Jugador jugadorX = new Jugador();
    static Enemigo enemigoX = new Enemigo();

    // Agregar personajes

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        eleccion();
        opcion = entrada.nextInt();
        System.out.println();
        opcionesPersonaje(opcion);
        agregarPersonaje();
        // I added a switch to be able to choose between the characters to "play"
    } // Fin main

    public static void pedirDatosJugador() throws IllegalArgumentException {
        entrada.nextLine();
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Nivel: ");
        nivel = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Clase: ");
        clase = entrada.nextLine();
        if (nivel < 1) {
            throw new IllegalArgumentException();
        } else {
            jugadorX = new Jugador(nombre, nivel, clase);
            System.out.println("\nPersonaje creado\n");
            System.out.println(jugadorX.toString());
        }
    }

    public static void pedirDatosEnemigo() throws IllegalArgumentException {
        entrada.nextLine();
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Nivel: ");
        nivel = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Clase: ");
        tipo = entrada.nextLine();
        if (nivel < 1) {
            throw new IllegalArgumentException();
        } else {
            enemigoX = new Enemigo(nombre, nivel, tipo);
            System.out.println("\nPersonaje creado\n");
            System.out.println(enemigoX.toString());
        }
    }

    public static void eleccion() {

        // We can choose whether to be the enemy or the player
        System.out.println("¿A quién eliges?");
        System.out.println("1. Bills");
        System.out.println("2. Goku");
        System.out.println("3. Vegeta");
        System.out.println("4. Picoro");
        System.out.println("5. Freezer");
        System.out.println("6. Numero 17");
        System.out.print("Opción: ");
    }

    public static void opcionesPersonaje(int opcion) {
        Generica<Personaje> personaje = new Generica<Personaje>();
        personaje.agregarPersonaje(new Enemigo("Goku", 100, "Esqueleto")); //1
        personaje.agregarPersonaje(new Enemigo("Vegeta", 99, "Orco")); //2
        personaje.agregarPersonaje(new Enemigo("Vegeta", 99, "Orco")); //3
        personaje.agregarPersonaje(new Enemigo("Picoro", 85, "Dragón")); //4
        personaje.agregarPersonaje(new Jugador("Freezer", 76, "Guerrero")); //1
        personaje.agregarPersonaje(new Jugador("Numero 17", 100, "Mago")); //2
        personaje.agregarPersonaje(new Jugador("Bills", -1, "Guerrero")); //3

        switch (opcion) {
            case 1:
                System.out.println("Ahora eres el bueno");
                Personaje jugador4 = personaje.mostrarPersonaje(6);
                System.out.println("Tu nivel es de " + jugador4.getNivel());
                try {
                    jugador4.atacar();
                    jugador4.usarHabilidadEspecial();
                } catch (RuntimeException e) {
                    System.out.println("\nNivel insuficiente para atacar");
                }
                break;
            case 2:
                Personaje enemigo1 = personaje.mostrarPersonaje(0);
                System.out.println("Ahora eres el enemigo");
                System.out.println("Tu nivel es de " + enemigo1.getNivel());
                System.out.print("Goku: ");
                enemigo1.gritar();
                break;
            case 3:
                Personaje enemigo2 = personaje.mostrarPersonaje(1);
                System.out.println("Ahora eres el enemigo");
                System.out.println("Tu nivel es de " + enemigo2.getNivel());
                System.out.print("Vegeta: ");
                enemigo2.gritar();
                break;
            case 4:
                Personaje enemigo3 = personaje.mostrarPersonaje(2);
                System.out.println("Ahora eres el enemigo");
                System.out.println("Tu nivel es de " + enemigo3.getNivel());
                System.out.print("Picoro: ");
                enemigo3.gritar();
                break;
            case 5:
                Personaje jugador1 = personaje.mostrarPersonaje(3);
                System.out.println("Ahora eres el bueno");
                System.out.println("Tu nivel es de " + jugador1.getNivel());
                System.out.print("Freezer: ");
                jugador1.usarHabilidadEspecial();
                break;
            case 6:
                Personaje jugador2 = personaje.mostrarPersonaje(4);
                System.out.println("Ahora eres el bueno");
                System.out.println("Tu nivel es de " + jugador2.getNivel());
                System.out.print("Numero 17: ");
                jugador2.usarHabilidadEspecial();
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public static void agregarPersonaje() {
        System.out.println("\n¿Quieres agregar un personaje? (si = 1/no = 2)");
        opcionLetra = entrada.nextInt();
        switch (opcionLetra) {
            case 1:
                System.out.println("\n¿Jugador o enemigo? (jugador = 1/enemigo = 2)");
                enemigo_jugador = entrada.nextInt();
                switch (enemigo_jugador) {
                    case 1:
                        // Jugador
                        try {
                            pedirDatosJugador();
                        } catch (IllegalArgumentException e) {
                            System.out.println("¡Error!");
                            System.out.println("El nivel es insuficiente");
                        }
                        break;
                    case 2:
                        // Enemigo
                        try {
                            pedirDatosEnemigo();
                        } catch (IllegalArgumentException e) {
                            System.out.println("¡Error!");
                            System.out.println("El nivel es insuficiente");
                        }
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }
                break;
            case 2:
                System.out.println("Adios...");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
