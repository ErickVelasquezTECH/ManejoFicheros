package org.example.module02.io;

import java.io.File;

public class IO {
    public static void main(String[] args) {
        File fichero=new File("file/archivo.txt");

        fichero.getParentFile().mkdir();


    }
}
