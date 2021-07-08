package ex11;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        int indice, max, min, soma = 0;
        double media;

        Scanner leitura = new Scanner(System.in);
        System.out.print("Informe o índice: ");
        indice = leitura.nextInt();

        int v[] = new int[indice];
        System.out.print("Digite o valor mínimo: ");
        min = leitura.nextInt();

        System.out.print("Digite o valor máximo: ");
        max = leitura.nextInt();

        System.out.println("\nVetor:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(v[i]);
            soma += v[i];
        }
        media = soma / indice;
        System.out.println("\nA média dos números é: " + media);
    }
}
