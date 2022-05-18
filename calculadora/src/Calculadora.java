import java.util.Arrays;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int menuOpcion = 0;
        // capturamos el valor ingresado
        Scanner sc;
        sc = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("######## CALCULADORA ##########");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto");
            System.out.println("0. Salir del programa");

            System.out.print("Introduzca una opción: ");

            // 1) Reoger el valor escrito en el teclado
            // 2) Transformar esa cadena de caracteres en entero
            menuOpcion = Integer.parseInt(sc.nextLine());

            // Evaluamos la opcion ingresada
            // 1) si la opcion es menor que 0 o mayor que 5,
            // no opcion valida

            if (menuOpcion <0 || menuOpcion >5){
                System.out.println("opción no válida. Vuelve a escoger");
            } else if (menuOpcion !=0) {
                System.out.println("\n");

                // Declaramos las variables
                float operando1, operando2;

                System.out.print("Intoduzaca el primer operando: ");
                operando1 = Float.parseFloat(sc.nextLine());

                System.out.print("Intoduzaca el segundo operando: ");
                operando2 = Float.parseFloat(sc.nextLine());

                //
                System.out.println("\n");

                switch (menuOpcion){
                    case 1: // Suma
                        System.out.println("El resultado de la suma es " + (operando1 + operando2));
                        break;
                    case 2: // Resta
                        System.out.println("El resultado de la resta es " + (operando1 - operando2));
                        break;
                        case 3: //Multiplicación
                            System.out.println("El resultado de la multiplicacion es " + (operando1 * operando2));
                            break;
                    case 4: //Divisón
                        System.out.println("El resultado de la división es " + (operando1 / operando2));
                        break;
                    case 5: //Resto
                        System.out.println("El resto de divid " + operando1 + " entre " + operando2+ " es " + (operando1 % operando2));
                            break;
                }
            }
        }while (menuOpcion !=0);
        sc.close();
        System.out.println("Finalizando la ejecución de la calculadora");
    }
}
