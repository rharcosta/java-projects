package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int a, b, c, soma;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Este programa realiza a soma de três números inteiros");
        System.out.print("Digite o primeiro número: ");
        a = leitura.nextInt();

        System.out.print("Digite o segundo número: ");
        b = leitura.nextInt();

        System.out.print("Digite o terceiro número: ");
        c = leitura.nextInt();

        soma = a + b + c;

        System.out.println("\nO resultado é igual a: " + soma);
    }
}
