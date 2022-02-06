public class ArrayBidimensional {
    public static void main(String[] args) {
        int arrayBi[][] = new int[2][3];
        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[0][2] = 3;
        arrayBi[1][0] = 100;
        arrayBi[1][1] = 200;
        arrayBi[1][2] = 300;

        for (int i = 0; i < arrayBi.length; i++){
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < arrayBi[1].length; j++){
                System.out.println("Estoy en i = " + i + ", j = " +j);
                System.out.println(arrayBi[i][j]);
            }
        }
    }
}
