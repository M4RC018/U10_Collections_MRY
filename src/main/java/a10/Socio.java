
package a10;

public class Socio implements Comparable<Socio> {
    
    String dni;
    String nombre;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Socio otro) {
        return this.dni.compareTo(otro.dni);
    }

    @Override
    public boolean equals(Object obj) {
       return dni.equals(((Socio)obj).dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public String toString() {
        return "Socio{dni= " + dni + ", nombre= " + nombre + "}";
    }
}