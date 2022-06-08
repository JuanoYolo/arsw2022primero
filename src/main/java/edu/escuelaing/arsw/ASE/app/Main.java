package edu.escuelaing.arsw.ASE.app;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("README.md");
        CountLine countLine = new CountLine(file);
        countLine.numeroLineas(file);
    }

}
