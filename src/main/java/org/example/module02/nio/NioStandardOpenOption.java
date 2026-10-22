package org.example.module02.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NioStandardOpenOption {
    public static void main(String[] args) throws IOException {
        Path ruta=Path.of("prueba.txt");

        Files.writeString(
                ruta,
                "Primera linea\n",
                StandardCharsets.UTF_8
        );

        Files.writeString(
                ruta,
                "Segunda linea\n",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }
}
