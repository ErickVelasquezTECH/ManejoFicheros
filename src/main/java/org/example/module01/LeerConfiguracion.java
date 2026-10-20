package org.example.module01;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class LeerConfiguracion {
    public static void main(String[] args) throws IOException {
        //Creamos un objeto Properties
        Properties propiedades=new Properties();

        //Leemos el archivo en bytes
        try(InputStream entrada= Files.newInputStream(Path.of("config.properties"))){
            //Guardamos el contenido en el objeto
            propiedades.load(entrada);

        }
        //Guardamos los valores(aplicacion.nombre=myaplication)
        String nombre = propiedades.getProperty("aplicacion.nombre");
        String puerto = propiedades.getProperty("servidor.puerto");

        //Los imprimimos(myaplication)
        System.out.println(nombre);
        System.out.println(puerto);
    }

}
