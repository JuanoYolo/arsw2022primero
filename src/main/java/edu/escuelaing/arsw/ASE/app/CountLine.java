package edu.escuelaing.arsw.ASE.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Clase para contar las lineas
 *
 */
public class CountLine
{

    public CountLine(File file) {
    }

    public void numeroLineas(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int cont = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String comparacionLinea = line.substring(0,2);
                System.out.println(comparacionLinea);
                cont ++;
            }
            System.out.println("El numero de lineas es: " + cont);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /**
    public static void main( String[] args )
    {
        //Como argumento en la linea de abajo se pone new File(args[1]
        File file = new File("README.md");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int cont = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String comparacionLinea = line.substring(0,2);
                System.out.println(comparacionLinea);
                if(comparacionLinea == "ho"){
                    System.out.println("Sirvio");
                    cont --;
                }

                cont ++;
            }
            System.out.println("El numero de lineas es: " + cont);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
     */
}
