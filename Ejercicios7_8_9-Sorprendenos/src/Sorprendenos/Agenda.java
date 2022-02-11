package Sorprendenos;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;


public class Agenda {
    public static void main(String[] args) {
        System.out.println("BIENVENID@ A TU AGENDA EN JAVA");
        mostrarMenu();

    }

    static void mostrarMenu(){
        System.out.println("Por favor, elige una opción:");
        System.out.println(" ");
        System.out.println("1. Crear contacto");
        System.out.println("2. Borrar contacto");
        System.out.println("3. Mostrar contactos");
        System.out.println("4. Guardar en contactos.txt");
        System.out.println("5. Salir");
        leerOpcion();
    }

    static HashMap<String, Integer> agenda = new HashMap<>();


    static void guardarContacto(){
        try{
            PrintStream guardar = new PrintStream("contactos.txt");
            guardar.print(agenda);
            guardar.close();
            System.out.println("Los contactos se han guardado correctamente");

        }catch(IOException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }

    }

    public static void leerOpcion(){
        Scanner escaner = new Scanner(System.in);
        int opcion = escaner.nextByte();
        switch (opcion) {
            case 1 -> {
                System.out.println("Escribe el nombre del contacto:");
                String nombre = escaner.next();
                System.out.println("Escribe el teléfono del contacto");
                int telefono = escaner.nextInt();
                agenda.put(nombre, telefono);
                System.out.println("El contacto ha sido almacenado correctamente");
                mostrarMenu();
            }
            case 2 -> {
                System.out.println(agenda);
                System.out.println("Introduce el nombre del contacto a eliminar:");
                String contactoAEliminar = escaner.next();
                if (agenda.containsKey(contactoAEliminar)) {
                    agenda.remove(contactoAEliminar);
                    System.out.println("El contacto se ha eliminado correctamente");
                    mostrarMenu();
                } else {
                    System.out.println("El contacto no existe");
                    mostrarMenu();
                }
            }
            case 3 -> {
                System.out.println(agenda);
                mostrarMenu();
            }
            case 4 -> {
                guardarContacto();
                mostrarMenu();
            }

            case 5 -> {
                System.exit(0);
            }
        }
    }

}
