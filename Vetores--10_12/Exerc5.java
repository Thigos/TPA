package listavetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        int a[],b[];
        a = new int[15];
        b = new int[15];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i<15; i++){
            System.out.println("Num " + i+ ": ");
            a[i] = in.nextInt();
            
        }
        
        
        for(int i = 0; i < 15; i++){
            int fatorial = 1;
            for(int j = a[i]; j > 0; j--){
                
                fatorial = fatorial *j;
            }
            b[i] = fatorial;
        }
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
    }
}
