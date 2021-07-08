package ex6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        int num;
        int v[] = new int[50];
        Scanner leitura = new Scanner(System.in);
        System.out.print("Número: ");
        num = leitura.nextInt();

        System.out.println("\nVetor múltiplo de " + num + ":");
        for (int i = 0; i < v.length; i++) {
            v[i] = num + i * num;
            System.out.println(v[i]);

        }
    }
}
