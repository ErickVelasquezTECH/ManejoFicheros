package org.example.module01;
import java.io.File;


public class FileExample {
    public static void main(String[] args) {
        //Creamos un objeto File con la ruta
        File fichero = new File("nota.txt");

        //Vemos el nombre del objeto File aunque no exista
        System.out.println(fichero.getName());

        //Comprobamos si existe
        System.out.println(fichero.exists());

        //Comprobamos si es un archivo (.txt,.pdf, etc..), da false si es (., carpeta)
        System.out.println(fichero.isFile());
    }
}
