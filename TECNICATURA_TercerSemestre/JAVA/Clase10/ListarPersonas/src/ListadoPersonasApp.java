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
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("Ocurrió un error: "+e.getMessage());
            }
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
    }//fin método mostrar menú

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //Revisamos la opción digitada a través de un switch
        switch (opcion){
            case 1 -> { //agregar una persona a la lista
                System.out.print("Ingrese el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Ingrese el teléfono: ");
                var tel = entrada.nextLine();
                System.out.print("Ingrese el correo: ");
                var email = entrada.nextLine();
                //creamos el objeto persona
                var persona = new Persona(nombre, tel, email);
                //agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size()+" elementos");
            }//fin caso 1
            case 2 -> { //listar a las personas
                System.out.println("Listado de personas: ");
                //mejoras con lambda y el método de referencia
                //personas.forEach((persona)-> System.out.println(persona));
                personas.forEach(System.out::println);
            }//fin caso 2
            case 3 -> { //salir del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            } //fin caso 3
            default -> System.out.println("Opción incorrecta: "+opcion);
        } //fin del switch
        return salir;
    }//fin método ejecutarOperación

} //fin de la clase ListadoPersonaApp