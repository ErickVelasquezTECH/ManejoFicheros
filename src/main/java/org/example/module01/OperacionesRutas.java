package org.example.module01;

import java.io.IOException;
import java.nio.file.Path;

public class OperacionesRutas {
    public static void main(String[] args) throws IOException {
        Path ruta=Path.of("relativa", "hola.txt");

        //Nombre de ultimo componente, aunque no exista
        System.out.println(ruta.getFileName());

        //Nombre del directorio padre
        System.out.println(ruta.getParent());

        //Ruta absoluta
        System.out.println(ruta.toAbsolutePath());


        Path ruta2=Path.of("relativa", ".", "subcarpeta", "..", "hola.txt");
        //Normaliza la ruta, y devuelve la ruta sin "." o ".."
        System.out.println(ruta2.normalize());

        //Crea el objeto ruta real con absoluta
        Path rutaReal = Path.of("nota.txt").toRealPath();
        System.out.println(rutaReal);
    }
}
