//Nombre: Nina Nájera Marakovits 231088
// Laboratorio 1 POO

import java.util.Scanner;

public class juego {
    static Scanner leer = new Scanner(System.in);
    static int puntos1 = 0;
    static int puntos2 = 0;
    static String jugador1;
    static String jugador2;

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego, por favor ingresa el nombre del primer jugador: "); //le pedimos su información al usuario
        jugador1 = leer.nextLine();
        System.out.println("Bienvenido al juego, por favor ingresa el nombre del segundo jugador: ");
        jugador2 = leer.nextLine();

        do { //hacemos un bucle donde podamos combinar las dos funciones que creamos
            j1();
            if (puntos1 >= 100) {
                System.out.println(jugador1 + " ha ganado. ¡Felicidades!");
                break;
            }

            j2();
            if (puntos2 >= 100) {
                System.out.println(jugador2 + " ha ganado. ¡Felicidades!");
                break;
            }
        } while (true);
    }

    public static void j1() { //programamos la funcion del primer jugador
        System.out.println(jugador1 + ", presiona 1 para girar los dados o 2 para pasar: ");
        String cp = leer.next();

        if (cp.equalsIgnoreCase("1")) {
            int dados = (int) (Math.random() * 6) + 1;
            System.out.println("Cayó " + dados);
            puntos1 += dados;
            System.out.println("Llevas " + puntos1 + " puntos");

            if (puntos1 >= 100) {
                System.out.println(jugador1 + " ha ganado. ¡Felicidades!");
                System.exit(0);
            }

            if (dados == 1) {
                System.out.println("Lástima, perdiste tus puntos");
                puntos1 = 0;
            }
        }
    }

    public static void j2() { //programamos la funcion del segundo jugador
        System.out.println(jugador2 + ", presiona 1 para girar los dados o 2 para pasar: ");
        String cp = leer.next();

        if (cp.equalsIgnoreCase("1")) {
            int dados = (int) (Math.random() * 6) + 1;
            System.out.println("Cayó " + dados);
            puntos2 += dados;
            System.out.println("Llevas " + puntos2 + " puntos");

            if (puntos2 >= 100) {
                System.out.println(jugador2 + " ha ganado. ¡Felicidades!");
                System.exit(0);
            }

            if (dados == 1) {
                System.out.println("Lástima, perdiste tus puntos");
                puntos2 = 0;
            }
        }
    }
}