import java.io.*;

public class FileInFileOut {
    public static void main(String[] args) {

        finout("/etc/passwd", "prueba.txt");
    }

    static void finout(String rutaEntrada, String rutaSalida){
        try{
            InputStream entrada = new FileInputStream(rutaEntrada);
            byte [] datos = entrada.readAllBytes();
            entrada.close();

            PrintStream salida = new PrintStream(rutaSalida);
            salida.write(datos);
            salida.close();

        }catch(IOException e){
            System.out.println("Error: Revisa que las rutas del archivo de entrada y del archivo de salida sean correctas.");
        }
    }
}
