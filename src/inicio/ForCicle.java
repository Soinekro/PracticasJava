package inicio;

import java.util.Scanner;

public class ForCicle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double suma = 0;
        double promedio = 0;
        System.out.println("escribe cuantas evaluaciones deseas ingresar: ");
        int evaluaciones = sc.nextInt();
        for(int $i = 1; $i <= evaluaciones; $i++) {
            System.out.println("Escribe la nota de tu pelicula favorita: ");
            nota = sc.nextDouble();
            suma += nota;
        }

        promedio = suma / evaluaciones;

        System.out.println("El promedio de las notas es: " + promedio);
    }
}
