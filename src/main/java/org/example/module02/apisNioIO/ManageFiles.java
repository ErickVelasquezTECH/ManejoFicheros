package org.example.module02.apisNioIO;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManageFiles {

    private static final String[] IO_RUTS = {
            "programacion/prueba.txt"
    };

    private static final String[] NIO_RUTS = {

    };


    public void createFileIO() {
        for (String r : IO_RUTS) {
            try {
                File archive = new File(r);
                if (archive.getParentFile() != null) {
                    archive.getParentFile().mkdirs();
                }
                archive.createNewFile();
            } catch (IOException e) {
                System.out.println("Error en la creacion de los archivos");
            }
        }
    }

    public void routeAbsoluteIO() {
        for (String r : IO_RUTS) {
            File archive = new File(r);
            System.out.println("- " + archive.getAbsolutePath());
        }

    }

    public void createFileNIO() {
        for (String r : NIO_RUTS) {
            try {
                Path path = Paths.get(r);

                if (path.getParent() != null) {
                    Files.createDirectories(path.getParent());
                }

                // Crear el archivo
                if (!Files.exists(path)) {
                    Files.createFile(path);
                }

            } catch (IOException e) {
                System.out.println("Error en la creacion de los archivos");
            }
        }
    }

    public void routeAbsoluteNIO() {
        for (String r : NIO_RUTS) {
            Path path = Paths.get(r);

            System.out.println("- " + path.toAbsolutePath());
        }
    }

}
