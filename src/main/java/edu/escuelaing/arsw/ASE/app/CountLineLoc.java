package edu.escuelaing.arsw.ASE.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Clase para contar lineas de codigo sin comentarios ni espacios en blanco
 */
public class CountLineLoc {
    public CountLineLoc(File file) {
    }
    /**
     * Contar lineas de codigo encontradas sin contar comentarios ni espacios en blanco
     * @param file Archivo a revisar para contar las lineas
     */
    public void numeroLineas(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int cont = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.contains("//") || line.contains("/*") || line.contains("*") || line.contains("#") || line.isEmpty()){
                    cont --;
                }
                cont ++;
            }
            System.out.println("El numero de lineas es: " + cont);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
