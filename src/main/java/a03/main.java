
package a03;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeros_sin_repetir = new ArrayList<>();
        
        for(int i = 0; i < 20; i++){
            int aleatorio = (int) (Math.random() * 10 + 1);
            numeros.add(aleatorio);
        }
        
        System.out.println(numeros);
        
        for(Integer n : numeros){
            if(!numeros_sin_repetir.contains(n)){
            numeros_sin_repetir.add(n);
        }
      }
        System.out.println(numeros_sin_repetir);
    }
}
