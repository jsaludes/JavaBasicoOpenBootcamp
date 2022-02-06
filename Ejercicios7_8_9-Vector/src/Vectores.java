import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        Vector<String> vector = new Vector(5);
        vector.add("Hola 1");
        vector.add("Hola 2");
        vector.add("Hola 3");
        vector.add("Hola 4");
        vector.add("Hola 5");

        vector.remove(2);
        vector.remove(3);

        System.out.println(vector);
        System.out.println(vector.capacity());

        /*
        El problema de usar la capacidad por defecto en el caso de tener que añadir 1000 elementos al vector radica en
        que tendrían que efectuarse en memoria múltiples copias de los valores cada vez que la capacidad por defecto y
        las consecuentes ampliaciones de esta capacidad se excediera, penalizando en velocidad y en desempeño la ejecución
        del programa.
        */
    }
}
