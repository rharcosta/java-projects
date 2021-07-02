package vetorcrescentesort;

import java.util.Arrays;

public class VetorCrescenteSort {

    public static void main(String[] args) {
        int A[] = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 50);
        }

        Arrays.sort(A);

        System.out.println("Índice \t Vetor");
        for (int i = 0; i < A.length; i++) {
            System.out.println(+i + " \t " + A[i]);
        }
    }

}
