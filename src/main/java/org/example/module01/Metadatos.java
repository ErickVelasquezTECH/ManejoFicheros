package org.example.module01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Metadatos {
    public static void main(String[] args) throws IOException {
        Path ruta=Path.of("nota.txt");
        //El nombre del ultimo componente, aunque no exista
        System.out.println("Nombre: "+ ruta.getFileName());
        //Si existe o no
        System.out.println("Existe: "+ Files.exists(ruta));
        // Si es un archivo normal o carpeta (false)
        System.out.println("Es fichero: "+ Files.isRegularFile(ruta));

        if (Files.exists(ruta)){

            //El tamaño en bytes siempre
            System.out.println("Tamaño: "+ Files.size(ruta)+ " bytes");
            //Ultima modificacion
            System.out.println("Ultima modificacion: "+
                    Files.getLastModifiedTime(ruta));
        }
    }
}
