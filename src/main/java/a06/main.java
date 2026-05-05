
package a06;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList <>();
        
        for (int i = 0; i < 20; i++){
            int aleatorio = (int) (Math.random()*100 + 1);
            numeros.add(aleatorio);
        }
        Integer[] tablaNumeros = numeros.toArray(new Integer [0]);
        
        Arrays.sort(tablaNumeros);
        
        ArrayList<Integer> numerosOrdenados = new ArrayList<>(Arrays.asList(tablaNumeros));
        
        System.out.println("Lista desordenada: " + numeros);
        System.out.println("Lista ordenada: " + numerosOrdenados);
    }
}
