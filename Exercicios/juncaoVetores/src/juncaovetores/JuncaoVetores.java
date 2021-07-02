package juncaovetores;

public class JuncaoVetores {

    public static void main(String[] args) {
        int A[] = new int[3];
        int B[] = new int[3];
        int C[] = new int[6];
        int i;
        for (i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 50);
            B[i] = (int) (Math.random() * 50);
        }
        for (i = 0; i < A.length; i++) {
            C[i] = A[i];
            C[i + 3] = B[i];
        }
        System.out.println("Índice \t Vet 1 \t Vet 2 \t Junção");
        for (i = 0; i < C.length; i++) {
            if (i < A.length) {
                System.out.println(i + " \t " + A[i] + " \t " + B[i] + " \t " + C[i]);
            } else {
                System.out.println(i + " \t \t \t " + C[i]);
            }
        }
    }

}
