import java.util.Scanner;

public class EjercicioClase1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        //Comienzo de tarea

        while (true) {


            System.out.println(" ");
            System.out.println("----- Ejecicio 1 -----");
            System.out.println("1.Punto A: Impresion de numeros entre 2 variables");
            System.out.println("2.Punto B: Numeros Pares");
            System.out.println("3.Punto C: Numeros Impares");
            System.out.println("4.Punto D: Ciclo For ");
            System.out.println("5. SALIR ");

            System.out.println("Ingrese una opcion:");
            int op = myObj.nextInt();

            if (op == 1) {
                System.out.println("Ingrese un numero: ");
                int numIn = myObj.nextInt();
                System.out.println("Ingrese otro numero: ");
                int numFin = myObj.nextInt();
                while (numIn <= numFin) {
                    System.out.print(numIn + " ; ");
                    numIn = numIn + 1;
                }
            }
            if (op == 2) {
                System.out.println("Ingrese un numero: ");
                int numIn = myObj.nextInt();
                System.out.println("Ingrese otro numero: ");
                int numFin = myObj.nextInt();
                while (numIn <= numFin) {
                    if ((numIn % 2) == 0) {
                        System.out.print(numIn + " ; ");
                    }
                    numIn = numIn + 1;
                }
            }

            if (op == 3) {
                System.out.println("Ingrese un numero: ");
                int numIn = myObj.nextInt();
                System.out.println("Ingrese otro numero: ");
                int numFin = myObj.nextInt();
                while (numIn <= numFin) {
                    if ((numIn % 2) == 1) {
                        System.out.print(numIn + " ; ");
                    }
                    numIn = numIn + 1;
                }
            }

            if (op == 4) {
                System.out.println("Ingrese un numero: ");
                int numIn = myObj.nextInt();
                System.out.println("Ingrese otro numero: ");
                int numFin = myObj.nextInt();
                for (int i = numFin; numIn <= numFin; numFin--) {
                    System.out.println(numFin);
                }
            }
            else {
                break;
            }

        }
    }
}
