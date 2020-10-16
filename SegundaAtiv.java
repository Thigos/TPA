package tpa;

import java.util.Scanner;

public class SegundaAtiv {
    public static void main(String args[]){
        int ate15 = 0;
        int de16a30 = 0;
        int de31a45 = 0;
        int de46a60 = 0;
        int acima61 = 0;
        
        for(int i = 0; i <= 14; i++){
            Scanner in = new Scanner(System.in);
            System.out.println("Idade da pessoa n° " + (i+1) + ": ");
            int idade = in.nextInt();
            if(idade <= 15){
                ate15++;
            }
            if(idade >= 16 && idade <=30){
                de16a30++;
            }
            if(idade >= 31 && idade <= 45){
                de31a45++;
            }
            if(idade >= 46 && idade <= 60){
                de46a60++;
            }
            if(idade > 61){
                acima61++;
            }
        }
        
        System.out.println("Até 15 anos: " + ate15 + " - " + (float)(ate15*100)/15 + "%");
        System.out.println("De 16 a 30 anos: " + de16a30 + " - " + (float)(de16a30*100)/15 + "%");
        System.out.println("De 31 a 45 anos: " + de31a45 + " - " + (float)(de31a45*100)/15 + "%");
        System.out.println("De 46 a 60 anos: " + de46a60 + " - " + (float)(de46a60*100)/15 + "%");
        System.out.println("Acima de 61 anos: " + acima61 + " - " + (float)(acima61*100)/15 + "%");
        
    }
}
