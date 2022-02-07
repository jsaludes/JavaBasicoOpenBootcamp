import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Texto 1");
        arrayList1.add("Texto 2");
        arrayList1.add("Texto 3");
        arrayList1.add("Texto 4");

        LinkedList<String> linkedList1 = new LinkedList<String>();
        for (int i = 0; i < arrayList1.size(); i++) {
            linkedList1.add(arrayList1.get(i));
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        for (int i = 0; i < linkedList1.size(); i++) {
            System.out.println(linkedList1.get(i));

        }
    }
}
