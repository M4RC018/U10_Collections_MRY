
package a04;
import java.util.ArrayList;
import java.util.Iterator;
public class main {
     public static void main(String[] args) {
         ArrayList <Integer> numeros  = new ArrayList <>();
         
         for(int i = 0; i < 100; i++){
             int aleatorio = (int)(Math.random()*10 + 1);
             numeros.add(aleatorio);
         }
         System.out.println(numeros);
         
         Iterator <Integer> it = numeros.iterator();
         while(it.hasNext()){
             int n = it.next();
             
             if(n == 5){
                 it.remove();
             }
         }
        System.out.println(numeros);
     }
}
