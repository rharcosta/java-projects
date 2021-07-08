package ex7;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        int indice;
        Scanner leitura = new Scanner(System.in);

        System.out.print("Qual valor do índice? ");
        indice = leitura.nextInt();

        int v[] = new int[indice];

        System.out.println("\nVetor ímpar com índice " + indice + ":");
        for (int i = 0; i < v.length; i++) {
            v[i] = 5 + (i * 2);
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
