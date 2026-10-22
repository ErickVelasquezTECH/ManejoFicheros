package org.example.module02.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.WatchService;

public class NioWatchService {
    public static void main(String[] args) throws IOException {
        Path directorio = Path.of("documentos");
        Files.createDirectories(directorio);

        try (WatchService observador =
                     FileSystems.getDefault().newWatchService()) {
            directorio.register(
                    observador,
                    java.nio.file.StandardWatchEventKinds.ENTRY_CREATE,
                    java.nio.file.StandardWatchEventKinds.ENTRY_DELETE,
                    java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY
            );

            System.out.println("Directorio registrado para observacion.");
        }
    }
}
