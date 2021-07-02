package trocavalorvetor;

import java.util.Scanner;

public class TrocaValorVetor {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int valor;
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Digite um valor: ");
        valor = leitura.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                vetor[i] = 0;
            }
            System.out.print(vetor[i] + "\t");
        }
    }
}
