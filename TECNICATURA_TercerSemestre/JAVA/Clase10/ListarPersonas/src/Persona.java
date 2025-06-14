public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacío
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    //Constructor con parámetros(sobrecarga de constructores)
    public Persona(String nombre, String tel,String email){
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
}
