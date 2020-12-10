package listavetores;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String args[]){
        int a[];
        a = new int[10];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("Num " + i+ ": ");
            a[i] = in.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            boolean primo = true;
            for(int j = 2; j <= a[i]; j++) {
                if(a[i] % j == 0 && j != a[i]) {
                        primo = false;
                        break;
                }
            }
            if(primo){
                System.out.println(a[i] + " é primo");
            }else{
                System.out.println(a[i] + " não é primo");
            }
        }
        
        
    }
}
