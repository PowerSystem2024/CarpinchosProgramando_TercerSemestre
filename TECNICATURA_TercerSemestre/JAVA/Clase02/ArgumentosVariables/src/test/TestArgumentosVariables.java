package test; // Define el paquete 'test' donde se encuentra esta clase

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        // Llama al método imprimirNumeros con 3 argumentos variables
        imprimirNumeros(3, 4, 5);

        // Llama al método imprimirNumeros con 2 argumentos variables
        imprimirNumeros(1, 2);

        // Llama al método variosParametros con dos String y luego varios enteros
        variosParametros("Juan", "Perez", 7, 8, 9);
    }
    
    // Método que recibe dos Strings y un número variable de enteros (varargs)
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre+" Apellido: "+apellido);  // Imprime nombre y apellido
        imprimirNumeros(numeros);  // Llama al método imprimirNumeros pasando el array de enteros
    }
    
    // Método que recibe un número variable de enteros y los imprime uno a uno
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);  // Imprime cada elemento del arreglo
        }
    }
}
