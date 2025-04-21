package ar.com.system2025.mundopc;

public class Teclado extends DispositivoEntrada{
    
    private final int idTeclado;
    private static int ContadorTeclados;
    
        public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        this.idTeclado = ++Teclado.ContadorTeclados;
        }
    
    @Override
    public String toString(){
        return "Teclado{" + "idTeclado=" + idTeclado +", "+super.toString()+ '}';  
    }
}