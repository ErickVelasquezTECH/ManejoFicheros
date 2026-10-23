package org.ies.tierno;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MaquinaDeEscribir {

    public static void main(String[] args) {
        String[] cadena = {"Erick", "Luis", "Patricia"};
        leerContenido("prueba.txt");
    }

    public static void depositarContenido(String[] cadena, String nombreFichero) {
        Path fichero = Path.of(nombreFichero);
        try {
            if (!Files.exists(fichero)) {
                Files.createFile(fichero);
            }

            for (String palabra : cadena) {
                Files.writeString(
                        fichero,
                        palabra + "*",
                        StandardCharsets.UTF_8,
                        StandardOpenOption.APPEND
                );
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerContenido(String nombreFichero) {
        Path fichero = Path.of(nombreFichero);
        try {
            if (Files.exists(fichero)) {
                String linea = Files.readString(
                                fichero,
                                StandardCharsets.UTF_8)
                        .replace("*", "%n");

                System.out.printf(linea);
            } else {
                System.out.print("El fichero no existe");
            }
        } catch (IOException e) {
            System.out.printf("Error: %s", e.getMessage());
        }
    }
}


