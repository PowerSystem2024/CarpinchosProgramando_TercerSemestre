public class Persona {
    //atributos de la claase
    private int id; //id de cada persona
    private String nombre; //nombre de la persona
    private String tel; //teléfono de cada persona
    private String email; //correo de la persona
    //atributo estático compartido para todas las instancias de la clase
    private static int numeroPersonas = 0;

    //Constructor vacío
    public Persona(){
        this.id = ++Persona.numeroPersonas; //se asigna el nuevo ID autoincrementando a la persona
    }

    //Constructor con parámetros(sobrecarga de constructores)
    public Persona(String nombre, String tel,String email){
        this(); //aca llama al constructor vacío para asignar el id automáticamente
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    //Métodos getters y setters para acceder y modificar los atributos privados
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; //devuelve el ID de la persona
    }

    public String getNombre() {
        return nombre; //devuelve el nombre
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; //nos permite modificar el nombre
    }

    public String getTel() {
        return tel; //devuelve el tel
    }

    public void setTel(String tel) {
        this.tel = tel; //permite modificcsr el tel
    }

    public String getEmail() {
        return email; //devuelve el mail
    }

    public void setEmail(String email) {
        this.email = email; //nos deja modificar el email
    }
    //este método nos permite mostrar un objeto Persona como texto
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    //Método main: para probar la clase de forma independiente
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Pérez", "15687650", "jperez@hotmail.com"); //crea una nueva persona
        System.out.println(persona1); //imprime los datos de la persona
    }

}
