package inicio;
public class Condiciones {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        boolean bulean = false;

        if (a > b) {
            System.out.println("a es mayor que b");
        } else {
            System.out.println("a no es mayor que b");
        }

        if (a > b && a > c) {
            System.out.println("a es mayor que b y c");
        } else {
            System.out.println("a no es mayor que b y c");
        }

        if (a > b || a > c) {
            System.out.println("a es mayor que b o c");
        } else {
            System.out.println("a no es mayor que b o c");
        }

        if (a > b) {
            System.out.println("a es mayor que b");
        } else if (a > c) {
            System.out.println("a es mayor que c");
        } else {
            System.out.println("a no es mayor que b ni c");
        }

        if (bulean) {
            System.out.println("bulean es verdadero");
        } else {
            System.out.println("bulean es falso");
        }

        // switch
        int dia = 4;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
        }
          
    }
}