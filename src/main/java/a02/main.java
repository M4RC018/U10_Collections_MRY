
package a02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
     public static void main(String[] args) {
         ArrayList<Integer> numeros = new ArrayList<>();
         
         try(Scanner sc = new Scanner (System.in)){
             
             System.out.println("Introduce numeros entero no negativos(y escribe -1 para terminar la lista):");
             
             while(true){
                 try{
                     int num = sc.nextInt();
                     
                     if(num == -1){
                         break;
                     }
                     if(num >= 0){
                         numeros.add(num);
                     }else{
                         System.out.println("Solo se permite números positivos");
                     }
                 }catch(Exception e){
                     System.out.print("Error: entrada no valida");
                     sc.nextInt();
                 }
             }
         }
         System.out.println("Colección:");
         System.out.println(numeros);
          
         System.out.println("Numeros pares:");
         for(Integer n: numeros){
             if(n%2 == 0){
                System.out.print(n + " ");
             }
         }
         
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            if (it.next() % 3 == 0) {
                it.remove();
            }
        }

        System.out.println("Colección sin múltiplos de 3:");
        System.out.println(numeros);
     }
     
}
