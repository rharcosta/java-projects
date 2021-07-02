package pesquisavetores;

import java.util.Arrays;

public class PesquisaVetores {

    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[5];
        int i, j, cont = 0;

        for (i = 0; i < A.length; i++) {
            A[i] = (int) (10 + Math.random() * 20);
            for (j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    i--;
                }
            }
        }

        for (i = 0; i < B.length; i++) {
            B[i] = (int) (10 + Math.random() * 20);
            for (j = 0; j < i; j++) {
                if (B[i] == B[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(A);
        Arrays.sort(B);

        System.out.println("Índice \t Vet1 \t Vet2");
        for (i = 0; i < A.length; i++) {
            if (i < B.length) {
                System.out.println("[" + i + "] = \t " + A[i] + " \t " + B[i]);
            } else {
                System.out.println("[" + i + "] = \t " + A[i]);

            }
        }

        for (i = 0; i < A.length; i++) {
            for (j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    cont++;
                }
            }
        }
        System.out.println("\nQuantidade de números repetidos: " + cont);

        int C[] = new int[cont];
        int x = 0;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    C[x] = A[i];
                    x++;
                }
            }
        }

        for (i = 0; i < C.length; i++) {
            System.out.println("[" + i + "] = \t" + C[i]);
        }
    }
}
