package org.example.module02.io;

import java.io.File;

public class IOFiles {
    public static void main(String[] args) {
        File fichero = new File("nota.txt");

        if (fichero.exists()) {
            System.out.println(fichero.getName());
            System.out.println(fichero.length());
        }
    }
}
