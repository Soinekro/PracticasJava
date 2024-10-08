package inicio;

import java.util.Scanner;

/**
 * WhileCicle
 */
public class WhileCicle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero: ");

        int numero = sc.nextInt();
        int contador = 1;
        double suma = 0;
        while(contador <= numero) {
            System.out.println("Ingresa una evaluacion: ");
            double nota = sc.nextDouble();
            contador++;
            suma += nota;
        }   
        double promedio = suma / numero;

        System.out.println("El promedio de las notas es: " + promedio);
    }
}