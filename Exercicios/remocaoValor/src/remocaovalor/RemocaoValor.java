package remocaovalor;

import java.util.Arrays;
import java.util.Scanner;

public class RemocaoValor {

    public static void main(String[] args) {
        int valor, i;
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner leitura = new Scanner(System.in);

        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.print("Digite um valor: ");
        valor = leitura.nextInt();

        for (i = 0; i < vetor.length; i++) {

            if (valor == vetor[i]) {
                for (i = i + 1; i < vetor.length; i++) {
                    vetor[i - 1] = vetor[i];
                }
                vetor[vetor.length - 1] = 0;
                i = vetor.length;  //Não entrar no for de fora
            }
        }
        for (i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
    }
}
