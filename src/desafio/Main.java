package desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Tonio Stark";
        String tipoCuenta = "Cuenta Corriente";
        double saldo = 1977.57;
        Scanner sc = new Scanner(System.in);

        System.out.println("********************************************");

        System.out.println("\nBienvenido " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: " + saldo);

        System.out.println("********************************************");

        String menu = """
                1. Depositar dinero
                2. Retirar dinero
                3. Mostrar saldo
                0. Salir
        """;
        
        int opcion = -1;
        System.out.println("********************************************");
        while (opcion != 0) {
            System.out.println(menu);
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Deposito realizado con exito");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro realizado con exito");
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual: " + saldo);
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }

    }
}
