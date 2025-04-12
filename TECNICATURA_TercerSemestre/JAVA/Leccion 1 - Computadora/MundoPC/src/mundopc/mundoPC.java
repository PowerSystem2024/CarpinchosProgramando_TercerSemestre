package mundopc;

import ar.com.system2025.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        
        
        //Mas computadoras
        Monitor monitorDell = new Monitor("Dell", 24);
        Teclado tecladoDell = new Teclado("Cable", "Dell");
        Raton ratonDell = new Raton("Cable", "Dell");
        
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");

        
        //Creamos otros objetos de diferente marca 
        Monitor monitorGamer = new Monitor("Gamer", 32); 
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        
        
        //Computadoras
        
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
  
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
       
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
       
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
      
        Computadora computadorasHPyGamer = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer,ratonHP);        

        Computadora computadoraHPyDell = new Computadora("Computadora HP y Dell",monitorHP, tecladoHP, ratonDell);
        
        Computadora computadoraHPyLenovo = new Computadora("computadora HP y Lenovo", monitorHP, tecladoHP, ratonLenovo);
        
        Computadora computadoraGameryDell = new Computadora("Computadora Gamer y Dell", monitorGamer, tecladoGamer, ratonDell);
        
        Computadora computadoraGameryLenovo = new Computadora("Computadora Gamer y Lenovo", monitorGamer, tecladoGamer, ratonLenovo);
    
        Computadora computadoraDellyLenovo = new Computadora("Computadora Dell y Lenovo", monitorDell, tecladoDell, ratonLenovo);
        
        Computadora computadoraVariasMarcas = new Computadora("Computadora Varias Marcas", monitorHP, tecladoDell, ratonLenovo);
                
        Orden orden1 = new Orden(); // Inicializamos el arreglo vacío
        Orden orden2 = new Orden(); //Una nueva lista para el objeto orden 2        
        orden1.agregarComputadora(computadoraHP);                                   //1
        orden1.agregarComputadora(computadoraGamer);                                //2
        orden1.agregarComputadora(computadoraDell);                                 //3
        orden1.agregarComputadora(computadoraLenovo);                               //4
        orden1.agregarComputadora(computadoraHPyDell);                              //5
        orden1.agregarComputadora(computadoraHPyLenovo);                            //6
        orden1.agregarComputadora(computadoraGameryDell);                           //7
        orden1.agregarComputadora(computadoraGameryLenovo);                         //8
        orden1.agregarComputadora(computadoraDellyLenovo);                          //9
        orden1.agregarComputadora(computadoraVariasMarcas);                         //10
        
        orden2.agregarComputadora(computadorasHPyGamer);                           
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
    
        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //Probar de esta manera los elementos al maximo rendimiento
        //Tarea realizada.
    }
}

