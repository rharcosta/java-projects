package ex8;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        int v[] = new int[8];
        int k[] = new int[8];

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite oito números inteiros");

        for (int i = 0; i < v.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = leitura.nextInt();
        }
        for (int i = 0; i < v.length; i++) {
            k[k.length - 1 - i] = v[i];
        }
        System.out.println("\nVetor inverso:");
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
    }
}
