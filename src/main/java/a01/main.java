
package a01;

import java.util.Arrays;


public class main {

    public static void main(String[] args) {
         Integer[] numeros = {1,2,3};
         
         numeros = guardar(4, numeros);
         
         System.out.print(Arrays.toString(numeros));
    }
    public static <T> T[] guardar(T elemento, T[] tabla){
        T[] nueva = Arrays.copyOf(tabla, tabla.length + 1);
        nueva [tabla.length] = elemento;
        return nueva;
    }
}
