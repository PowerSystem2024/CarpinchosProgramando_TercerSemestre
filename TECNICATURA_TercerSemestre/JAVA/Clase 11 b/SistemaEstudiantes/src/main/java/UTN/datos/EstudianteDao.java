package UTN.datos;

import UTN.dominio.Estudiante;
import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDao {

    // Metodo listar
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();

        //Creamos objetos que son necesarios para comunicarnos con la base de datos

        PreparedStatement ps; //Para preparar la sentencia sql
        ResultSet rs; //Almacena el resultado obtenido desde la base de datos

        //Creamos un objeto conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2025 ORDER BY idestudiantes2025";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2025"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Agregamos a la lista de estudiantes ↑
                estudiantes.add(estudiante);
            }
        } catch (Exception e){
            System.out.println("Ocurrio un error al seleccionar los datos. " + e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Ocurrió un error al cerrar la conexion. " + e.getMessage());
            }
        }
        return estudiantes;
    }

    //Metodo buscar por id = find by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps; //Para preparar la sentencia sql
        ResultSet rs; //Almacena el resultado obtenido desde la base de datos
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2025 WHERE idestudiantes2025 = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();

            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //Si se encontró un registro, devuelve verdadero
            }
        }catch (Exception e){
            System.out.println("Error al buscar el estudiante. " + e.getMessage());
        }finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion. " + e.getMessage());
            }
        }
        return false; //Si no se encontró registro
    }

    //Metodo Agregar nuevo estudiante

    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps; //Para preparar la sentencia sql
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2025 (nombre, apellido, telefono, email) VALUES(?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true; //Se pudo registrar al estudiante
        }catch (Exception e){
            System.out.println("Error al agregar el estudiante. " + e.getMessage());
        }finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion. " + e.getMessage());
            }
        }
        return false; //Si no se pudo realizar el registro
    }

    //Modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps; //Para preparar la sentencia sql
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2025 SET nombre = ?, apellido = ?, telefono = ?, email = ? WHERE idestudiantes2025 = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true; //Se pudo modificar al estudiante
        }catch (Exception e){
            System.out.println("Error al modificar el estudiante. " + e.getMessage());
        }finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion. " + e.getMessage());
            }
        }
        return false; //Si no se pudo realizar el registro
    }

    public static void main(String[] args) {
        var estudianteDao = new EstudianteDao();

        // Listar estudiantes
        /*System.out.println("------------------------------------------------");
        System.out.println("            Metodo listarEstudiantes()          ");
        System.out.println("------------------------------------------------");
        System.out.println("\nListado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//Funcion Lambda para */

        //Agregar Estudiante
        /*System.out.println("\n------------------------------------------------");
        System.out.println("            Metodo agregarEstudiante()          ");
        System.out.println("------------------------------------------------");
        var nuevoEstudiante = new Estudiante("Melina", "Aguilar", "3815454534", "meliaguilar@mail.com");
        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        if (agregado)
            System.out.println("Estudiante agregado: " + nuevoEstudiante);
        else
            System.out.println("No se ha a gregado el estudiante: " + nuevoEstudiante);*/

        // Buscar por ID
        /*var estudiante1 = new Estudiante(1);
        System.out.println("------------------------------------------------");
        System.out.println("          Metodo buscarEstudiantePorId()        ");
        System.out.println("------------------------------------------------");
        System.out.println("\n Estudiantes antes de la búsqueda: " + estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if(encontrado)
            System.out.println("\n Estudiante encontrado: " + estudiante1);
        else
            System.out.println("No se encontró el estudiante: " + estudiante1.getIdEstudiante());*/

        // Modificar Estudiante
        System.out.println("------------------------------------------------");
        System.out.println("           Metodo modificarEstudiante()         ");
        System.out.println("------------------------------------------------");
        var estudianteModificado = new Estudiante(1, "Ezequiel", "Quiroz", "2165985422", "ezequiroz@gmail.com");
        var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        if(modificado)
            System.out.println("\n Estudiante modificado: " + estudianteModificado);
        else
            System.out.println("No se modificó el estudiante: " + estudianteModificado);

    }
}
