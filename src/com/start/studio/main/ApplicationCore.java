package com.start.studio.main;
import com.start.studio.utils.Tools;

import java.util.Scanner;


public class ApplicationCore {
    public static void main(String[] args) {
        Tools tools = new Tools();
        Scanner input = new Scanner(System.in);
        boolean ripetitore = true;

        System.out.println("Inserisci il tuo nome:");
        String nome = input.nextLine();

        do{
            tools.menu(nome);
            String scelta = input.nextLine();
            ripetitore = tools.checkScelta(scelta);
            if(ripetitore){
                tools.workInProgress();
            }
        }while(ripetitore);

        System.out.println("A presto, " + nome);
    }
}