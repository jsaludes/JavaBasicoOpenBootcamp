public class ArrayUnidimensional {

    public static void main(String[] args) {
        String arrayDeStrings[] = new String[7];
        arrayDeStrings[0] = "Casa";
        arrayDeStrings[1] = "Reloj";
        arrayDeStrings[2] = "Armario";
        arrayDeStrings[3] = "Horno";
        arrayDeStrings[4] = "Juguete";
        arrayDeStrings[5] = "Pablo";
        arrayDeStrings[6] = "Televisor";

        for (String i : arrayDeStrings){
            System.out.println(i);
        }
    }
}
