import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> arrayEnteros = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++){
            arrayEnteros.add(i);                // Añado al array 10 enteros
        }
        for (int i = 0; i < arrayEnteros.size(); i++){
            if (arrayEnteros.get(i) % 2 == 0){
                arrayEnteros.remove(i);         // Elimino los enteros pares del array
            }
        }
        for (int i = 0; i <arrayEnteros.size(); i++){
            System.out.println(arrayEnteros.get(i));
        }                                       // Recorro el array para imprimir el ArrayList final
    }
}
