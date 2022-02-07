import java.util.Scanner;

public class DividePorCero {
    public static void main(String[] args) {

        try{
            dividePorCero();
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }

    static void dividePorCero(){
        System.out.println("Por favor, introduce un valor:");
        Scanner entrada = new Scanner(System.in);
            int resultado = entrada.nextInt() / 0;
            System.out.println(resultado);
        }
}

