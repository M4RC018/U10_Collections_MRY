
package a09;
import java.util.*;
public class main {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        
        for(int i = 0; i < 30; i++){
            int aleatorio = (int) (Math.random()*100 + 1);
            numeros.add(aleatorio);
        }
        System.out.println(numeros);
        
        Set<Integer> numRep = new HashSet<>(numeros);
        System.out.println(numRep);
        
        Set<Integer> numOrden = new TreeSet<>(numeros);
        System.out.println(numOrden);
        
        Set<Integer> numLinked = new LinkedHashSet<>(numeros);
        System.out.println(numRep);
    }
    
}
