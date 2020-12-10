package listavetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        int a[];
        a = new int[10];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Num " + i + ": ");
            a[i] = in.nextInt();

        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
