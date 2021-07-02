package exerciciovetor;

import java.util.Scanner;

public class ExercicioVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int i, j, aux, ord = 0;
        for (i = 0; i < A.length; i++) {
            A[i] = (int) (10 + Math.random() * 20);
            for (j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    i--;
                }
            }
        }
        for (i = 0; i < A.length; i++) {
            for (j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }
        }
        System.out.println("Insira 10 Números entre 20 e 40:");
        for (i = 0; i < B.length; i++) {
            ord++;
            System.out.print(+ord + "º Número: ");
            B[i] = sc.nextInt();
            while ((B[i] < 20) || (B[i] > 40)) {
                System.out.print("Número fora do padrão! Digite novamente: ");
                B[i] = sc.nextInt();
            }
            for (j = 0; j < i; j++) {
                if (B[i] == B[j]) {
                    i--;
                }

            }
        }

        for (i = 0; i < B.length; i++) {
            for (j = i + 1; j < B.length; j++) {
                if (B[i] < B[j]) {
                    aux = B[i];
                    B[i] = B[j];
                    B[j] = aux;
                }
            }
        }
        System.out.println("Vetor \t Números ordenados");
        for (i = 0; i < A.length; i++) {
            System.out.println(+A[i] + " \t " + B[i]);
        }
    }

}
