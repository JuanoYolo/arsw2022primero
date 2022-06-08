package edu.escuelaing.arsw.ASE.app;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File(args[1]);
        String var = args[0];
        if(var.equals("phy")){
            CountLinePhy countLinePhy = new CountLinePhy(file);
            countLinePhy.numeroLineas(file);
        }
        else if(var.equals("loc")){
            CountLineLoc countLineLoc = new CountLineLoc(file);
            countLineLoc.numeroLineas(file);
        }

    }
}
