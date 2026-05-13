
package a12;

import java.util.*;
public class main {

    
    public static void main(String[] args) {
        List<Integer> premios = new ArrayList<>(Arrays.asList(1000,50,500,50,200));
        
        int cantidadCicuenta = Collections.frequency(premios, 50);
        
        System.out.println("Cantidad de premios de 50€: " + cantidadCicuenta);
    
        System.out.println("Premio más alto: "+Collections.max(premios));
        System.out.println("Premio más bajo: "+Collections.min(premios));
        
        Collections.shuffle(premios);
        System.out.println("Lista de premios desordenada: " + premios);
        
        Collections.sort(premios);
         System.out.println("Lista de premios ordenada: " + premios);
         
        int posicion = Collections.binarySearch(premios, 500);
        System.out.println("Posicion del premio de 500€ : " + posicion);
    }
    
}
