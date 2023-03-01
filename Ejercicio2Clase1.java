import java.util.Scanner;

public class Ejercicio2Clase1 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        //Problema2

        //-Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
        //(3,5 canastas basicas para un hogar tipo 2 segund INDEC)
        //-Tener 3 o mas vehiculos con una antiguedad menor a 5 years
        //-Tener 3 o mas inmuebles
        //-Poseer una embarcacion, una aeronave de luj o ser titular de activos societarios
        //que muestren capacidad economica plena


        while (true) {

            boolean superaVehiculo = false;
            boolean superaInmueble = false;

            System.out.println("--- Programa de la Nacion ---");
            System.out.println("1. CATEGORIA MONOTRIBUTO");
            System.out.println("2. SALIR");

            System.out.println("Ingrese una opcion: ");
            int op = myObj.nextInt();

            if (op == 1) {
                System.out.println("Ingrese sus ingresos mensuales TOTALES del hogar : ");
                float ingresos = myObj.nextFloat();

                System.out.println("Posee vehiculos? [1 = SI] [2= NO] : ");
                int vehiculo = myObj.nextInt();

                //validacion vehiculo
                if (vehiculo == 1) {
                    System.out.println("Ingrese cantidad de vehiculos: ");
                    int cantVehiculo = myObj.nextInt();
                    if (cantVehiculo >= 3) {
                        superaVehiculo = true;
                    }
                } else {
                    int cantVehiculo = 0;
                }

                System.out.println("Posee inmuebles? [ 1= SI ] [ 2= NO] :");
                int inmuebles = myObj.nextInt();
                //validacion inmueble
                if (inmuebles == 1) {
                    System.out.println("Ingrese la cantidad de inmuebles");
                    int cantInmueble = myObj.nextInt();
                    if (cantInmueble >= 3) {
                        superaInmueble = true;
                    }
                } else {
                    int cantInmueble = 0;
                }

                if ((ingresos <= 748382.07) && (superaVehiculo == false) && (superaInmueble == false)) {
                    System.out.println("Cateogria A");

                } else if ((ingresos <= 1112459.83) && (superaVehiculo == true) && (superaInmueble == false)) {
                    System.out.println("Categoria B");
                } else if ((ingresos > 1112459.83) && (superaVehiculo == true) && (superaInmueble == true)) {
                    System.out.println("Categoria C");
                }
            }
            else {
                break;
            }
        }






    }
}
