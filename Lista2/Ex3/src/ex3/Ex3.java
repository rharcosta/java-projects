package ex3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        int a, b;
        double resultado;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Este programa realiza a divisão de 2 números inteiros");
        System.out.print("Digite o primeiro número: ");
        a = leitura.nextInt();

        System.out.print("Digite o segundo número: ");
        b = leitura.nextInt();

        resultado = ((double) a) / b;

        System.out.println("\nO resultado da divisão é igual a: " + resultado);
    }
}
