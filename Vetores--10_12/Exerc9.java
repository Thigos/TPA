package listavetores;

import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
        int a[],b[];
        a = new int[10];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("Num " + i+ ": ");
            a[i] = in.nextInt();
            
        }
        boolean palin = true;
        for(int i = 0; i<10; i++){
            if(a[i] != a[(a.length -1 ) - i]){
                palin = false;
                break;
            }
        }
        
        if(palin){
            System.out.println("é um palíndromo");
        }else{
            System.out.println("não é um palíndromo");
        }
    }
}
