package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        int num, soma = 0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Pgm que realiza a somatória de X números inteiros");
        System.out.print("Quantidade: ");
        num = leitura.nextInt();

        for (int i = 0; i <= num; i++) {
            soma = soma + i;
        }
        System.out.println("\nA somatória dos números é: " + soma);
    }
}
