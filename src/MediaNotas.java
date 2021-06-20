import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) throws Exception{
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese cuantas notas sumara: ");
        int n= scanner.nextInt();
        double suma=0;
        for(int i=1;i<=n;i++){
            
            System.out.println("ingrese nota "+(i)+": ");
            double nota=scanner.nextDouble();
            suma=suma+nota;
            
        }
        System.out.println("el promedio es "+suma/n);
    }
}
