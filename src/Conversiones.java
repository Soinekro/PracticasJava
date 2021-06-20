import java.util.Scanner;

public class Conversiones{
    public static void main(String[] args) throws Exception{
        Scanner scanner= new Scanner(System.in);

        //llamamos entrada de datos soles
        System.out.println("Ingrese Valor de dolares: ");
        //guardamos variable en dolar
        double dolar = scanner.nextDouble();
        //asignamos valor de soles
        double valor = 3.92;
        double conversion = dolar*valor;//multiplicamos dolar*sol
        System.out.println(conversion+" soles");//imprimimos en consola
        //llamamos entrada de datos en dolares
        System.out.println("ingrese valor en soles");
        //guardamos variable en sol
        double sol = scanner.nextDouble();
        //asignamos valor de dolares
        double dolares=sol/valor;//dividimos sol/
        System.out.println(dolares+" Dolares");//imprimimos en pantalla
    }
}