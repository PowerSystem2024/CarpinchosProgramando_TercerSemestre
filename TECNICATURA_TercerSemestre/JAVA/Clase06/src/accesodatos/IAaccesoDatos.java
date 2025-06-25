package accesodatos; // Declaramos que esta interfaz pertenece al paquete 'accesodatos'

// Definimos una interfaz que representa operaciones básicas de acceso a datos
public interface IAaccesoDatos {

    // Constante que define el número máximo de registros permitidos
    int MAX_REGISTRO = 10; // Las variables en una interfaz son automáticamente públicas, estáticas y finales

    // Método para insertar un registro
    // Este método es abstracto y no tiene implementación
    void insertar();

    // Método para listar los registros
    void listar();

    // Método para actualizar un registro existente
    void actualizar();

    // Método para eliminar un registro
    void eliminar();
}