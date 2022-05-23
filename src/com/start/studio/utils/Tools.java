package com.start.studio.utils;

public class Tools {
    // Metodo che richiameremo ogni volta che a arriveremo in un punto in cui non abbiamo ancora pronto il codice
    public void workInProgress(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Purtoppo il codice è ancora in fase di scrittura e mi ci vorrà un pò");
        System.out.println("Stay tuned BIAAATCH!");
    }

    // Metodo per il menù
    public void menu(String nome){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Salve " + nome + ", benvenuto.");
        System.out.println("Effettua la tua scelta tra le seguenti:");
        System.out.println("1 - ");
        System.out.println("0 - Exit");
        System.out.println("-----------------------------------------------------------------------");
        System.err.println("Resto in attesa... \n");
    }

    // Check della scelta
    public boolean checkScelta(String scelta){
        if(scelta.equalsIgnoreCase("end") ||
                scelta.equalsIgnoreCase("0") ||
                scelta.equalsIgnoreCase("exit")){
            return false;
        }
        return true;
    }
}