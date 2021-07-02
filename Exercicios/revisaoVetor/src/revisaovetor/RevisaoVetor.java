package revisaovetor;

import java.util.Arrays;
import java.util.Scanner;

public class RevisaoVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criação dos vetores
        int A[] = new int[10];
        int i, j, x = 0, y = 0, contp = 0, conti = 0, N;
        boolean achou = false;

        //Preenchimento de números randômicos de 20 a 50
        for (i = 0; i < A.length; i++) {
            A[i] = (int) (20 + Math.random() * 50);

            //Número sem repetição
            for (j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    i--;
                }
            }
        }

        //Qtd de pares e ímpares
        for (i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                contp++;
            } else {
                conti++;
            }
        }
        //Declaração vetorpar e vetorimpar
        int VP[] = new int[contp];
        int VI[] = new int[conti];

        //Números pares e ímpares
        for (i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                VP[x] = A[i];
                x++;
            } else {
                VI[y] = A[i];
                y++;
            }
        }

        //Exibir os vetores em ordem crescente
        Arrays.sort(A);
        System.out.println("Índice \t Vetor1");
        for (i = 0; i < A.length; i++) {
            System.out.println(+i + " \t " + A[i]);
        }

        Arrays.sort(VP);
        System.out.println("\nÍndice \t Vetor2");
        for (x = 0; x < VP.length; x++) {
            System.out.println(+x + " \t " + VP[x]);
        }

        System.out.println("\nÍndice \t Vetor3");
        Arrays.sort(VI);
        for (y = 0; y < VI.length; y++) {
            System.out.println(+y + " \t " + VI[y]);
        }

        //Pesquisa sequencial
        System.out.print("\nSolicite um número para pesquisa [Entre 20 e 50]: ");
        N = sc.nextInt();

        for (i = 0; i < A.length; i++) {
            if (N == A[i]) {
                System.out.println("Localizado na posição:" + i);
                achou = true;
            }
        }
        if (achou == false) {
            System.out.println("Número não localizado");
        }
    }

}
