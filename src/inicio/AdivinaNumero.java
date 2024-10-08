package inicio;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = new Random().nextInt(100); 
        int contador = 0; 
        int intento = -1; 

        do {
            System.out.println("Adivina el numero que estoy pensando (o ingresa -1 para salir): ");
            intento = sc.nextInt(); 

            if (intento == -1) {
                System.out.println("Has salido del juego.");
                return; 
            }

            contador++; 

            if (intento == numero) {
                break; 
            } else {
                if (intento < numero) {
                    System.out.println("El numero que estoy pensando es mayor");
                } else {
                    System.out.println("El numero que estoy pensando es menor");
                }
            }
        } while (intento != numero);

        System.out.println("Felicidades, adivinaste el numero en " + contador + " intentos");
        sc.close(); // Close the scanner
    }
}
