package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        double a, b, c, media;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Este programa calcula a média de 3 números reais");

        System.out.print("Digite o primeiro número: ");
        a = leitura.nextDouble();

        System.out.print("Digite o segundo número: ");
        b = leitura.nextDouble();

        System.out.print("Digite o terceiro número: ");
        c = leitura.nextDouble();

        media = (a + b + c) / 3;

        System.out.println("\nA média dos números é igual a: " + media);
    }
}
