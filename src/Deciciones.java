import java.util.Scanner;

public class Deciciones {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double valor = 3.93;
        System.out.println("Tipos:\n" + "1)dolar a soles\n" + "2)Soles a dolares\n"+"Ingrese opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                double dolar = scanner.nextDouble();
                double soles = dolar * valor;
                System.out.println(soles);
                break;
            case 2:
                double sol = scanner.nextDouble();
                double dolares = sol / valor;
                System.out.println(dolares);
                break;
            default:
                break;
        }
    }
}
