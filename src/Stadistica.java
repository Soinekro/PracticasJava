import java.util.Scanner;

public class Stadistica {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese cuantos valores tiene: ");
        int n = scanner.nextInt();

        double valores[] = new double[n];

        double suma=0;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Dar el valor a "+(i+1));
            double aux= scanner.nextDouble();
            valores[i]=aux;
            suma+=aux;
        }

        double promedio = suma/n;

        double sumdesviacion =0;
        for (int i = 0; i < valores.length; i++) {
            sumdesviacion += Math.pow(valores[i]-promedio,2);
        }

        double desviacion = Math.sqrt(sumdesviacion/(n));

        System.out.println("la media "+promedio);
        System.out.println("la desviacion estandar es: "+desviacion);
    }
}
