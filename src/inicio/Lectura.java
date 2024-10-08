package inicio;

import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu pelicula favorita: ");
        String pelicula = sc.nextLine();
        System.out.println("ahora escribe la fecha de lanzamiento: ");
        int fecha = sc.nextInt();
        System.out.println("Por ultimo la nota del 1 al 10 que le das: ");
        double nota = sc.nextDouble();
        System.out.println("Tu pelicula favorita es: " + pelicula);
        System.out.println("Fue lanzada en: " + fecha);
        System.out.println("Le das una nota de: " + nota);
    }
}
