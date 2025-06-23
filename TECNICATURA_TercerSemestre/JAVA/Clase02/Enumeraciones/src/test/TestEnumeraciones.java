package test; // Define el paquete 'test' donde está esta clase

import enumeraciones.Continentes; // Importa el enum Continentes del paquete 'enumeraciones'
import enumeraciones.Dias;        // Importa el enum Dias del paquete 'enumeraciones'

public class TestEnumeraciones {
    public static void main(String[] args) {
        // Estas líneas están comentadas:
        // System.out.println("Dia 1: " + Dias.LUNES);
        // indicarDiaSemana(Dias.LUNES); // Las enumeraciones se tratan como cadenas
        // Ahora no se deben utilizar comillas, se accede a través del operador de punto

        // Muestra el continente número 4 (AMERICA) usando el enum Continentes
        System.out.println("Continentes No. 4: " + Continentes.AMERICA);
        // Muestra la cantidad de países del continente América
        System.out.println("No. de paises en el 4to. continente: "
                + Continentes.AMERICA.getPaises());
        // Muestra la cantidad de habitantes del continente América
        System.out.println("No. de habitantes en el 4to. continente: "
                + Continentes.AMERICA.getHabitantes());

        // Muestra el continente número 1 (AFRICA)
        System.out.println("Continentes No. 1: " + Continentes.AFRICA);
        // Muestra la cantidad de países del continente África
        System.out.println("No. de paises en el 1er. continente: "
                + Continentes.AFRICA.getPaises());
        // Muestra la cantidad de habitantes del continente África
        System.out.println("No. de habitantes en el 1er. continente: "
                + Continentes.AFRICA.getHabitantes());

        // Muestra el continente número 2 (EUROPA)
        System.out.println("Continentes No. 2: " + Continentes.EUROPA);
        // Muestra la cantidad de países del continente Europa
        System.out.println("No. de paises en el 2do. continente: "
                + Continentes.EUROPA.getPaises());
        // Muestra la cantidad de habitantes del continente Europa
        System.out.println("No. de habitantes en el 2do. continente: "
                + Continentes.EUROPA.getHabitantes());

        // Muestra el continente número 3 (ASIA)
        System.out.println("Continentes No. 3: " + Continentes.ASIA);
        // Muestra la cantidad de países del continente Asia
        System.out.println("No. de paises en el 3er. continente: "
                + Continentes.ASIA.getPaises());
        // Muestra la cantidad de habitantes del continente Asia
        System.out.println("No. de habitantes en el 3er. continente: "
                + Continentes.ASIA.getHabitantes());

        // Muestra el continente número 5 (OCEANIA)
        System.out.println("Continentes No. 5: " + Continentes.OCEANIA);
        // Muestra la cantidad de países del continente Oceanía
        System.out.println("No. de paises en el 5to. continente: "
                + Continentes.OCEANIA.getPaises());
        // Muestra la cantidad de habitantes del continente Oceanía
        System.out.println("No. de habitantes en el 5to. continente: "
                + Continentes.OCEANIA.getHabitantes());
    }
    
    // Método privado que recibe un valor del enum Dias y muestra un mensaje según el día
    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            // Comentario para agregar los demás días y el caso default
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Dia no valido");
        }
    }
}
