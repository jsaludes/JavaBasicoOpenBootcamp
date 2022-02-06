public class FuncionIva {

    public static void main(String[] args) {

        double resultado = calculaConIva(7);
        System.out.println(resultado);

    }

        static double calculaConIva(int precioSinIva) {

            return precioSinIva * 1.21d;
        }
}
