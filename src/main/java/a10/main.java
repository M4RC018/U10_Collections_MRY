
package a10;

import java.util.*;
public class main {

    public static void main(String[] args) {
        Set<Socio> conjuntoSocios = new HashSet<>();
        conjuntoSocios.add(new Socio("12345678N", "Ana"));
        conjuntoSocios.add(new Socio("87654321M", "Jose"));
        
        System.out.println(conjuntoSocios);
        
        
        Set<Socio> ordenSocios = new TreeSet<>(conjuntoSocios);
        ordenSocios.add(new Socio("321456878H", "Manuel"));
        
        System.out.println(ordenSocios);
        
        List<Socio> listaSocios = new ArrayList<>(ordenSocios);
        listaSocios.add(new Socio("463738298G", "Eugenio"));
        System.out.println(listaSocios);
        
        
    }
    
}
