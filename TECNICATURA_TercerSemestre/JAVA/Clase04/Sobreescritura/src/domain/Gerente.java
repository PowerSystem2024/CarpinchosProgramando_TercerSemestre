package domain;

public class Gerente extends Empleado { //La clase 'Gerente', hereda de la clase 'Empleado'.

    private String departamento; // Declaramos una variable privada para almacenar el departamento del gerente.

    public Gerente(String nombre, double sueldo, String departamento) { // Definimos el constructor de la clase 'Gerente' con tres parámetros: nombre, sueldo y departamento.
        super(nombre, sueldo); // Llamamos al constructor de la clase padre 'Empleado' para inicializar el nombre y el sueldo.
        this.departamento = departamento; // Asignamos el valor del parámetro 'departamento' al atributo correspondiente de la clase.
    }

    @Override
    public String obtenerDetalle() { // Sobrescribimos el método 'obtenerDetalle' que heredamos de la clase 'Empleado'.
        return super.obtenerDetalle() + ", Departamento: " + this.departamento; // Devolvemos el detalle del empleado (usando el método de la clase padre) y le agregamos el departamento.
    }          
}
