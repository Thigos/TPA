package listavetores;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String args[]){
        int a[];
        a = new int[5];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i<5; i++){
            System.out.println("Num " + i+ ": ");
            a[i] = in.nextInt();
        }
        
        for(int i = 0; i<5; i++){
            System.out.println("Tabuado do " +a[i]);
            for(int j = 1; j <= 10; j++) {
                int calcu = a[i] * j;
                System.out.println( a[i] + "x" + j +"= "+ calcu);
            }
            System.out.println("\n");
        }
    }
}
