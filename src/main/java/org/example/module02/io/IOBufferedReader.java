package org.example.module02.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOBufferedReader {
    public static void main(String[] args) throws IOException {
        try (BufferedReader lector = Files.newBufferedReader(
                Path.of("nota.txt"),
                StandardCharsets.UTF_8)) {

            String linea = lector.readLine();
            System.out.println(linea);
        }
    }
}
