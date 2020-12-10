package listavetores;

import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        int a[],b[];
        a = new int[10];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("Num " + i+ ": ");
            a[i] = in.nextInt();
            
        }
        System.out.println("Buscar por: ");
        int busca = in.nextInt();
        for(int i = 0; i<10; i++){
            if(a[i] == busca){
                System.out.println(busca + " encontrado na posição " + i);
            }
        }
        
    }
}
