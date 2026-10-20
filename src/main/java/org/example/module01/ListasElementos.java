package org.example.module01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListasElementos {
    public static void main(String[] args) throws IOException {
        Path directorio = Path.of(".");

        try (Stream<Path> elementos = Files.list(directorio.normalize())) {
            elementos.forEach(System.out::println);
        }
    }
}
