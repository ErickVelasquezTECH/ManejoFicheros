package org.example.module02.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIOPathFiles {
    public static void main(String[] args) throws IOException {
        Path fichero=Path.of("nota.txt");

        Files.writeString(fichero, "10", StandardCharsets.UTF_8);

        String nota=Files.readString(fichero, StandardCharsets.UTF_8);

        System.out.println(nota);
        System.out.println(fichero.getFileName());
        System.out.println(fichero.getParent());
        System.out.println(fichero.isAbsolute());
    }

}
