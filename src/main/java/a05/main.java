
package a05;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList <>();
        
        for(int i = 0; i < 100; i++){
            int aleatorio = (int)(Math.random()*10 +1);
            numeros.add(aleatorio);
        }
        System.out.println(numeros);
        
        ArrayList <Integer> numeros_5 = new ArrayList<>();
        numeros_5.add(5);
        
        numeros.removeAll(numeros_5);
        
        System.out.println("Sin 5:" + numeros);
        
   }
}
