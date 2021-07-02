package pesquisasequencial;

import java.util.Scanner;

public class PesquisaSequencial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int i, N;
        boolean achou = false;
        for (i = 0; i < A.length; i++) {
            A[i] = (int) (+Math.random() * 50);
        }
        System.out.print("Digite um número para pesquisar: ");
        N = sc.nextInt();
        System.out.println("\nPosição \tValor");
        for (i = 0; i < A.length; i++) {
            System.out.println(+i + "\t\t" + A[i]);
        }
        for (i = 0; i < A.length; i++) {
            if (N == A[i]) {
                System.out.println("\nLocalizado na posição: " + i);
                achou = true;
            }
        }
        if (achou == false) {
            System.out.println("\nNúmero não localizado!");
        }
    }

}
