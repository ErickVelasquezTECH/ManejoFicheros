package org.example.module02.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOBufferedWriter {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter escritor = Files.newBufferedWriter(
                Path.of("nota.txt"),
                StandardCharsets.UTF_8
        )) {
            escritor.write("8");
        }
        System.out.println(Files.readString(Path.of("nota.txt")));
    }
}
