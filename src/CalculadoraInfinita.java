import java.util.Scanner;

public class CalculadoraInfinita {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese opcion\n" + "1)Suma\n" + "2)Resta\n" + "3)Multiplicacion\n" + "4)Division\n");
            
        int opcion = scanner.nextInt();
        do {            
            switch (opcion) {
                case 1:
                    System.out.print("ingrese numero 1: ");
                    double s1 = scanner.nextDouble();
                    System.out.print("ingrese numero 2: ");
                    double s2 = scanner.nextDouble();
                    System.out.println(Suma(s1, s2));
                    break;
                case 2:
                System.out.print("ingrese numero 1: ");
                    double r1 = scanner.nextDouble();
                    System.out.print("ingrese numero 2: ");
                    double r2 = scanner.nextDouble();
                    System.out.println(Resta(r1, r2));

                    break;
                case 3:
                System.out.print("ingrese numero 1: ");
                    double m1 = scanner.nextDouble();
                    System.out.print("ingrese numero 2: ");
                    double m2 = scanner.nextDouble();
                    System.out.println(Multiplicacion(m1, m2));
                    break;
                case 4:
                System.out.print("ingrese numero 1: ");
                    double d1 = scanner.nextDouble();
                    System.out.print("ingrese numero 2: ");
                    double d2 = scanner.nextDouble();
                    System.out.println(Division(d1, d2));
                    break;
                case 5:
                    System.out.println("Adios gracias por usar este programa");
                    break;
                default:
                    System.out.println("ingrese un valor valido");
                    break;
            }

        } while (opcion < 6);
    }

    static Double Suma(double n1, double n2) {
        double suma = n1 + n2;
        return suma;
    }
    static Double Resta(double n1, double n2) {
        double suma = n1 - n2;
        return suma;
    }
    static Double Multiplicacion(double n1, double n2) {
        double suma = n1 * n2;
        return suma;
    }
    static Double Division(double n1, double n2) {
        double suma = n1 / n2;
        return suma;
    }
}
