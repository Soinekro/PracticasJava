import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese opcion\n" + "1)Multiplicacion\n" + "2)Division\n" + "3)Suma\n" + "4)Resta\n");
        double opcion = scanner.nextDouble();

        if (opcion >= 5) {
            System.out.println("valor no Valido");
        } else if (opcion == 1) {
            System.out.print("ingrese numero 1:");
            double n1 = scanner.nextDouble();
            System.out.print("ingrese numero 2: ");
            double n2 = scanner.nextDouble();
            System.out.println("la multiplicacion es : "+n1*n2);
        }else if (opcion == 2) {
            System.out.print("ingrese numero 1:");
            double n1 = scanner.nextDouble();
            System.out.print("ingrese numero 2: ");
            double n2 = scanner.nextDouble();
            System.out.println("la division es : "+n1/n2);
        }else if (opcion == 3) {
            System.out.print("ingrese numero 1:");
            double n1 = scanner.nextDouble();
            System.out.print("ingrese numero 2: ");
            double n2 = scanner.nextDouble();
            System.out.println("la suma es : "+(n1+n2));
        }else{
            System.out.print("ingrese numero 1:");
            double n1 = scanner.nextDouble();
            System.out.print("ingrese numero 2: ");
            double n2 = scanner.nextDouble();
            System.out.println("la Resta es : "+(n1-n2));
        }
    }
}
