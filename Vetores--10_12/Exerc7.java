package listavetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc7 {
     public static void main(String[] args) {
        int a[],b[],c[];
        a = new int[10];
        b = new int[10];
        c = new int[10];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("a: Num " + i+ ": ");
            a[i] = in.nextInt();
        }
        
        for(int i = 0; i<10; i++){
            System.out.println("b: Num " + i+ ": ");
            b[i] = in.nextInt();
        }
        
        for(int i = 0; i<10;i++){
            boolean contem = false;
            for(int j = 0; j <10; j++){
                if(a[i] != b[j]){
                    if(j == 9 && !contem){
                        c[i] = a[i];
                    }
                }else{
                    contem = true;
                }
            }
        }
        
        
        
        System.out.println(Arrays.toString(c));
        
    }
}
