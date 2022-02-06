public class Reverse {

    public static String reverse(String texto) {
        String resultado = "";
        for(int i=texto.length()-1;i>=0;i--) {
            resultado += texto.charAt(i);
            System.out.print(resultado);
        }
        return resultado;
    }

}