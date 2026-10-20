package org.example.module01;

import java.nio.file.Files;
import java.nio.file.Path;

public class EjemploRutas {
    public static void main(String[] args) {
        // Creamos un objeto Path con una ruta absoluta
        Path absoluta = Path.of(
                "/home/ericktech/IdeaProjects/acceso-datos/nota.txt"
        );

        // Creamos un objeto Path con la ruta relativa
        Path relativa = Path.of("relativa", "hola.txt");

        //Imprime la el contenido del objeto (la ruta absoluta)
        System.out.println(absoluta);

        //Imprime la el contenido del objeto (la ruta relativa)
        System.out.println(relativa);

        // Imprime el contenido del objeto pero como ruta absoluta
        System.out.println(relativa.toAbsolutePath());
    }
}
