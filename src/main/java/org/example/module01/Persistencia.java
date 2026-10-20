package org.example.module01;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Persistencia {
    public static void main(String[] args) throws IOException {
        Path fichero = Path.of("nota.txt");

        //Escribe en el fichero, lo crea si no existe, o reescribe
        Files.writeString(fichero, "9.5", StandardCharsets.UTF_8);

        //Guardamos el contenido en un String
        String contenido = Files.readString(fichero, StandardCharsets.UTF_8);

        double nota = Double.parseDouble(contenido);
        System.out.println("Nota recuperada: " + nota);
    }
}