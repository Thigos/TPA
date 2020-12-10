
package listavetores;

import java.util.Scanner;

public class Exerc1 {
    
    public static void main(String[] args) {
        int N, quantPar, quantImp;
        String a[],b[];
        N = 20;
        quantPar = 0;
        quantImp = 0;
        a = new String[N];
        b = new String[N];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < N; i++){
            
            System.out.println("Posição " + i+ ": ");
            a[i] = String.valueOf(in.nextInt());
            if(Integer.valueOf(a[i])%2 != 0){
                quantImp++;
            }else{
                quantPar++;
            }
        }
        
        for(int i = 0; i<N; i++){
            if(Integer.valueOf(a[i])%2 != 0){
                b[i] = a[i];
                a[i] = "§";
            }else{
                b[i] = "§";
            }
            
        }
        
        System.out.println("Quantidade de pares: " + quantPar);
        
        for(int i = 0; i<N; i++){
            if(!a[i].equals("§")){
                System.out.println(a[i]);
            }
        }
        
        System.out.println("Quantidade de impares: " + quantImp);
        
        for(int i = 0; i<N; i++){
            if(!b[i].equals("§")){
                System.out.println(b[i]);
            }
        }
        
    }
}
