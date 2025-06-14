import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos el menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            System.out.println();
        }//fin ciclo while
    }//fin método main

    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                ******* Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Seleccione una opción: ");
    }
}