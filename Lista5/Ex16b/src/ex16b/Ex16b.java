package ex16b;

import java.util.Scanner;

public class Ex16b {

    public static void main(String[] args) {
        int k, contMenor = 0, contMaior = 0;
        int v[] = new int[20];

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número entre 0 e 9: ");
        k = leitura.nextInt();

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (9 - 0 + 1)) + 0;
            if (v[i] < k) {
                contMenor++;
            } else {
                contMaior++;
            }
        }
        System.out.println("\nVetor de 80 posições com números aleatórios entre 0 e 9:");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }

        System.out.println("");
        System.out.println("\nNúmeros menores que o valor digitado: " + contMenor);
        System.out.println("Números maiores ou iguais ao valor digitado: " + contMaior);
    }
}
