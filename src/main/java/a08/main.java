
package a08;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class main {

    public static void main(String[] args) {
      List<String>listaA = new ArrayList<>();
      List<String>listaB = new ArrayList<>();
      listaA.add("Ana");
      listaA.add("Luis");
      listaA.add("Marta");
      listaA.add("Luis");
      
      listaB.addAll(listaA);
      System.out.println("Lista A: " + listaA);
      System.out.println("Lista B: " + listaB);
      //Comparar las listas
      System.out.println("¿Son iguales?: " + listaA.equals(listaB));
      
      //Imprime el ultimo elemento de la lista
      System.out.println("Ultimo elemento de la lista: " + listaA.lastIndexOf("Luis"));
      System.out.println("Primer elemento de la lista: " + listaA.indexOf("Luis"));
      
      //Ordenar la lista
      listaA.sort(null);
      System.out.println("Odenar lista: " + listaA);
       //Comparar las listas después de ordenar listaA
      System.out.println("¿Son iguales?: " + listaA.equals(listaB));
      //Ordear listaB al revés
      listaB.sort(Collections.reverseOrder());
      System.out.println("Lista B ordenada al revés: " + listaB);
      
    }
    
}
