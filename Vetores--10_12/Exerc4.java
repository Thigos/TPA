package listavetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String args[]){
        int a[];
        a = new int[11];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i<11; i++){
            System.out.println("Num " + i+ ": ");
            a[i] = in.nextInt();
        }
        
        for(int i = 0; i < 11; i++){
            int cont = 1;
            int base = 2;
            while (cont <= i){
                base = base *2;
                cont++;
            }
            a[i] = base;
        }
        
        System.out.println(Arrays.toString(a));
    }
}
