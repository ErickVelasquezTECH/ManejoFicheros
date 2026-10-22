package org.example.module02.io;

import java.io.File;

public class IOFile {
    public static void main(String[] args) {
        File fichero = new File("nota.txt");

        if (fichero.exists()) {
            System.out.println(fichero.getName());
            System.out.println(fichero.length());
            System.out.println(fichero.getParent()); //Devuelve un String
            System.out.println(fichero.getParentFile()); //Devuelve un File
        }
    }
}
