package org.example.module02.io;

import java.io.FileInputStream;
import java.io.IOException;

public class IOInputStream {
    public static void main(String[] args) throws IOException {
        try (FileInputStream entrada =
                     new FileInputStream("DonOsvaldo.jpg")) {
            //unicamente el primer byte
            int primerByte = entrada.read();
            //Si en otra linea ponemos otro ...=entrada.read(), sera el segundo byte, nunca vuelve
            System.out.println(primerByte);
        }
    }
}
