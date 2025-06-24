import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //objeto scanner para leer la entrada del usuario
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>(); //creamos la lista para almacenar objetos de tipo Persona
        //Empezamos el menu
        var salir = false; //para salir del menú
        while (!salir){
            mostrarMenu(); //mostramos el menú al usuario
            try{
                salir = ejecutarOperacion(entrada, personas); //se ejecuta la opción elegida y actualiza si debe salir
            } catch (Exception e){
                System.out.println("Ocurrió un error: "+e.getMessage()); //captura cualquier error del sistema
            }
            System.out.println();
        }//fin ciclo while
    } //fin método main

    private static void mostrarMenu(){
        //mostramos las opciones al usuario
        System.out.print("""
                ******* Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Seleccione una opción: ");
    }//fin método mostrar menú

    // método que ejecuta la operación elegida por el usuario
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine()); //lee la opción ingresada y la convierte a entero
        var salir = false; //variable local para saber si salir del programa
        //Revisamos la opción digitada a través de un switch
        switch (opcion){
            case 1 -> { //agregar una persona a la lista
                System.out.print("Ingrese el nombre: ");
                var nombre = entrada.nextLine(); //lee el nombre
                System.out.print("Ingrese el teléfono: ");
                var tel = entrada.nextLine(); //lee el teléfono
                System.out.print("Ingrese el correo: ");
                var email = entrada.nextLine(); //lee el correo
                //creamos el objeto persona
                var persona = new Persona(nombre, tel, email);
                //agregamos la persona a la lista
                personas.add(persona); //agrega el objeto Persona a la lista
                System.out.println("La lista tiene: "+personas.size()+" elementos");
            }//fin caso 1
            case 2 -> { //listar a las personas registradas
                System.out.println("Listado de personas: ");
                //mejoras con lambda y el método de referencia
                //personas.forEach((persona)-> System.out.println(persona));
                personas.forEach(System.out::println); //imprime cada persona utilizando método de referencia
            }//fin caso 2
            case 3 -> { //salir del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            } //fin caso 3
            default -> System.out.println("Opción incorrecta: "+opcion); //mensaje por si se agrega una opción incorrecta
        } //fin del switch
        return salir;
    }//fin método ejecutarOperación

} //fin de la clase ListadoPersonaApp