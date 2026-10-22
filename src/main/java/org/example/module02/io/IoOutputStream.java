package org.example.module02.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoOutputStream {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream salida =
                     new FileOutputStream("datos.bin")) {
            //Escribe un byte
            salida.write(65);
        }
    }
}
