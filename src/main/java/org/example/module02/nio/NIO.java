package org.example.module02.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIO {
    public static void main(String[] args) {
        Path fichero = Path.of("file/hola.txt");
        try {
            Files.createDirectories(fichero.getParent());

            String contenido =
                    "Hola, estoy aprendiendo Java.\n" +
                            "Esta es mi primera nota.\n";

            Files.writeString(fichero, contenido, StandardCharsets.UTF_8);

            String texto=Files.readString(fichero, StandardCharsets.UTF_8);

            System.out.println(texto);
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
