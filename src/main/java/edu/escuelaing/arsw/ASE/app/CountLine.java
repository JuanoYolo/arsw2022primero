package edu.escuelaing.arsw.ASE.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CountLine
{
    public static void main( String[] args )
    {
        File file = new File(args[1]);
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
