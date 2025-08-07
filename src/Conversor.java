/**
 * Conversor de Monedas usando ExchangeRate API
 * Challenge N°2 Correspondiente al Programa Oracle Next Education - Primer proyecto con APIs
 *
 * @author [Federico Heinrich]
 * @version 1.0
 */

import java.util.Scanner;
import apis.CambioMoneda;
import models.Moneda;

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

        String monedaOrigen = "";
        String monedaDestino = "";
        double cantidad = 0;
        switch (opcion) {
            case 1:
                monedaOrigen = "USD";
                monedaDestino = "ARS";
                System.out.println("Ingrese la cantidad en Dolares a convertir en Pesos Argentinos: ");
                cantidad= scanner.nextDouble();
                break;
            case 2:
                monedaOrigen = "USD";
                monedaDestino = "BRL";
                System.out.println("Ingrese la cantidad en Dolares a convertir en Reales Brasileños: ");
                cantidad = scanner.nextDouble();
                break;
            case 3:
                monedaOrigen = "USD";
                monedaDestino = "CLP";
                System.out.println("Ingrese la cantidad en Dolares a convertir en Pesos Chilenos: ");
                cantidad = scanner.nextDouble();
                break;
            case 4:
                monedaOrigen = "ARS";
                monedaDestino = "USD";
                System.out.println("Ingrese la cantidad en Pesos Argentinos en convertir a Dolares: ");
                cantidad = scanner.nextDouble();
                break;
            case 5:
                monedaOrigen = "BRL";
                monedaDestino = "USD";
                System.out.println("Ingrese la cantidad en Reales Brasileños en convertir a Dolares: ");
                cantidad = scanner.nextDouble();
                break;
            case 6:
                monedaOrigen = "CLP";
                monedaDestino = "USD";
                System.out.println("Ingrese la cantidad en Pesos Chilenos en convertir a Dolares: ");
                cantidad = scanner.nextDouble();
                break;
            case 7:
                System.out.println("¡Gracias por usar el Conversor de Monedas! ¡Hasta luego!");
                scanner.close();
                return;
        }
        // Llamo a la API para obtener el cambio de moneda
        CambioMoneda cambio = new CambioMoneda(); // creo el objeto que maneja la API
        // Al objeto cambio le aplico su metodo obtenerCambio que me devuelve un objeto de tipo Moneda enviandole sus dos parametros monedaOrigen, monedaDestino
        Moneda moneda = cambio.obtenerCambio(monedaOrigen, monedaDestino);
        if (moneda != null) {
            // Si la moneda no es nula, imprimo el resultado
            double resultado = cantidad * moneda.getValor();
            System.out.printf("%.2f %s son %.2f %s.%n", cantidad, monedaOrigen, resultado, monedaDestino);
        } else {
            // Si la moneda es nula, imprimo un mensaje de error
            System.out.println("No se pudo obtener el cambio de moneda. Por favor, intente más tarde.");
        }
        // Cierro el scanner
        scanner.close();
        System.out.println("¡Gracias por usar el Conversor de Monedas! ¡Hasta luego!");

    }
}


