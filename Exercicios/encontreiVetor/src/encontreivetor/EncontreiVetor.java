package encontreivetor;

import java.util.Scanner;

public class EncontreiVetor {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero, contador = 0;
        int[] a = {8, 8, 2, 9, 1, 1, 3, 2, 6, 7, 4};
        System.out.print("Digite um número: ");
        numero = leitura.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (numero == a[i]) {
                contador = contador + 1;
            }
        }
        System.out.println("\nHá " + contador + " número(s) igual(s) ao seu no vetor!");
    }
}
