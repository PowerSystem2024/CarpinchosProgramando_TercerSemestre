import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Ciclo infinito
        while(true){
            System.out.println("******* Aplicación Calculadora *******");
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, entrada);
                } // Fin IF
                else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    // El break rompe el ciclo y sale
                    break;
                } else {
                    System.out.println("Opción errónea: " + operacion);
                }
                // Imprimimos un salto de línea antes de repetir el menú
                System.out.println();
            } catch(Exception e){ // Fin del TRY, comienzo del CATCH
                System.out.println("Ocurrió un error: " + e.getMessage());
                System.out.println();
            }
        } // Fin WHILE
    } // Fin MAIN

    // Metodo mostrarMenu
    private static void mostrarMenu(){
        // Mostramos el menú
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.println("¿Operación a realizar?");
    } // Fin mostrarMenu

    // Metodo ejecutarOperacion
        private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite el valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        double resultado;
        switch (operacion) {
            // Suma
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            // Resta
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            // Multiplicación
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            }
            // División
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado de la división: " + resultado);
            }
            default -> System.out.println("Opción errónea: " + operacion);
        } // Fin SWITCH
    } // Fin ejecutarOperacion
} // Fin CLASE
