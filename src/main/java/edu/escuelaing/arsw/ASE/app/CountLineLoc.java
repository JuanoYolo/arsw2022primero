package edu.escuelaing.arsw.ASE.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLineLoc {
    public CountLineLoc(File file) {
    }

    public void numeroLineas(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int cont = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.contains("//") || line.contains("/*") || line.contains("*") || line.contains("#")){
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
