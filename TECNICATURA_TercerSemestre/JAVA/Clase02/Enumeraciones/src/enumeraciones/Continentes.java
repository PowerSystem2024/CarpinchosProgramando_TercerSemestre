package enumeraciones; // Define el paquete 'enumeraciones' donde está este enum

// Declaración del enum Continentes con datos asociados: cantidad de países y habitantes
public enum Continentes {
    AFRICA(53, "1.2 billones"),      // Continente África con 53 países y 1.2 billones de habitantes
    EUROPA(46, "1.1 billones"),      // Continente Europa con 46 países y 1.1 billones de habitantes
    ASIA(44, "1.9 millones"),        // Continente Asia con 44 países y 1.9 millones de habitantes
    AMERICA(34, "150.2 millones"),   // Continente América con 34 países y 150.2 millones de habitantes
    OCEANIA(14, "1.2 billones");     // Continente Oceanía con 14 países y 1.2 billones de habitantes
    
    private final int paises;        // Variable que almacena la cantidad de países (constante)
    private String habitantes;       // Variable que almacena la población (cadena de texto)
    
    // Constructor del enum que recibe países y habitantes para inicializar las variables
    Continentes(int paises, String habitantes){
        this.paises = paises;            // Asigna la cantidad de países
        this.habitantes = habitantes;    // Asigna la cantidad de habitantes
    }
    
    // Método getter para obtener la cantidad de países
    public int getPaises(){
        return this.paises;
    }
    
    // Método getter para obtener la cantidad de habitantes
    public String getHabitantes(){
        return this.habitantes;
    }
}
