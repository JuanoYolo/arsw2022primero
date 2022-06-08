package edu.escuelaing.arsw.ASE.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Clase para contar las lineas de codigo completas
 *
 */
public class CountLinePhy
{

    public CountLinePhy(File file) {
    }

    /**
     * Contar lineas de codigo encontradas
     * @param file Archivo a revisar para contar las lineas
     */
    public void numeroLineas(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int cont = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                cont ++;
            }
            System.out.println("El numero de lineas es: " + cont);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
