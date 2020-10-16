package tpa;

import java.util.Scanner;


public class TerceiraAtiv {
    public static void main(String args[]){
        //VARS*
        int quantSuper50 = 0;
        float somaAlt10x20 = 0;
        int quantPess10x20 = 0;
        int pesoInfer40 = 0;
        int idadeMaisNova = 9999;
        int idadeMaisVelha = 0;
        float pesoMaisNova = 0;
        float pesoMaisVelha = 0;

        for(int i = 1; i<=25; i++){
            //ENTRADA
            Scanner in = new Scanner(System.in);
            System.out.println("Idade: ");
            int scanIdade = in.nextInt();
            System.out.println("Altura: ");
            float scanAlt = in.nextFloat();
            System.out.println("Peso: ");
            float scanPeso = in.nextFloat();
            System.out.println("\n");
            //PROCESSAMENTO
            if(scanIdade > 50){
                quantSuper50++;
            }
            if(scanIdade >=10 && scanIdade <=20){
                somaAlt10x20 = somaAlt10x20 + scanAlt;
                quantPess10x20++;
            }
            if(scanPeso < 40){
                pesoInfer40++;
            }
            if(scanIdade < idadeMaisNova){
                idadeMaisNova = scanIdade;
                pesoMaisNova = scanPeso;
            }
            if(scanIdade > idadeMaisVelha){
                idadeMaisVelha = scanIdade;
                pesoMaisVelha = scanPeso;
            }
        }
        
        //RESULTADO
        System.out.println("Pessoas com idade superior a 50 anos: " + quantSuper50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + 
                somaAlt10x20 / quantPess10x20);
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: " + 
                (pesoInfer40*100)/25 + "%");
        System.out.println(pesoInfer40);
        System.out.println("Peso da pessoa mais velha: " + pesoMaisVelha);
        System.out.println("Peso da pessoa mais nova: " + pesoMaisNova);
    }
}
