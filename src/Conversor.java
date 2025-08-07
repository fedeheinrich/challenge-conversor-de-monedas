/**
 * Conversor de Monedas usando ExchangeRate API
 * Challenge N°2 Correspondiente al Programa Oracle Next Education - Primer proyecto con APIs
 *
 * @author [Federico Heinrich]
 * @version 1.0
 */

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        System.out.println("""
                ¡Bienvenido al Conversor de Monedas!
                
                ***************MENU****************
                
                1) Dolar ---> Peso Argentino
                2) Dolar ---> Real Brasileño
                3) Dolar ---> Peso Chileno
                4) Peso Argentino ---> Dolar
                5) Real Brasileño ---> Dolar
                6) Peso Chileno ---> Dolar
                7) Salir
                
                ***********************************
                
                """);

        // Creo un objeto de tipo Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción del menú (1-7): ");
        int opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 7) {
            System.out.println("Opción inválida. Por favor, seleccione una opción del menú (1-7): ");
            opcion = scanner.nextInt();
        }
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad en Dolares a convertir en Pesos Argentinos: ");
                double dolares= scanner.nextDouble();
                // logica con apis
                System.out.printf("%.2f Dolares son %.2f Pesos Argentinos.%n", dolares, resultado);
                break;
            case 2:
                System.out.println("Ingrese la cantidad en Dolares a convertir en Reales Brasileños: ");
                double dolaresARealesBrasilenos = scanner.nextDouble();
                // logica con apis
                System.out.printf("%.2f Dolares son %.2f Reales Brasileños.%n", dolaresARealesBrasilenos, resultado2);
                break;
            case 3:
                System.out.println("Ingrese la cantidad en Dolares a convertir en Pesos Chilenos: ");
                double dolaresAPesosChilenos = scanner.nextDouble();
                //
                System.out.printf("%.2f Dolares son %.2f Pesos Chilenos.%n", dolaresAPesosChilenos, resultado3);
                break;
            case 4:
                System.out.println("Ingrese la cantidad en Pesos Argentinos en convertir a Dolares: ");
                double pesosArgentinosADolares = scanner.nextDouble();
                //
                System.out.printf("%.2f Pesos Argentinos son %.2f Dolares.%n", pesosArgentinosADolares, resultado4);
                break;
            case 5:
                System.out.println("Ingrese la cantidad en Reales Brasileños en convertir a Dolares: ");
                double realesBrasilenosADolares = scanner.nextDouble();
                //
                System.out.printf("%.2f Reales Brasileños son %.2f Dolares.%n", realesBrasilenosADolares, resultado5);
                break;
            case 6:
                System.out.println("Ingrese la cantidad en Pesos Chilenos en convertir a Dolares: ");
                double pesosChilenosADolares = scanner.nextDouble();
                //
                System.out.printf("%.2f Pesos Chilenos son %.2f Dolares.%n", pesosChilenosADolares, resultado6);
                break;
            case 7:
                System.out.println("¡Gracias por usar el Conversor de Monedas! ¡Hasta luego!");
                break;
        }
    }
}


