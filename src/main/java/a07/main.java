package a07;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        lista1.add(40);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(99);
        lista2.add(99);

        // Insertar 5 en índice 0
        lista1.add(0, 5);

        // Insertar lista2 en índice 2
        lista1.addAll(2, lista2);

        // Mostrar elemento en índice 4
        System.out.println("Elemento índice 4: " + lista1.get(4));

        // Sustituir último elemento por 500 y guardar el anterior
        int ultimoIndice = lista1.size() - 1;
        int valorAnterior = lista1.set(ultimoIndice, 500);
        System.out.println("Valor sustituido: " + valorAnterior);

        // Eliminar elemento en índice 1
        lista1.remove(1);

        // Eliminar el valor 99
        lista1.remove(Integer.valueOf(99));

        // Mostrar resultado final
        System.out.println("Lista final: " + lista1);
    }
}