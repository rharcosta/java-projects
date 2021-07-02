package vetordecrescente;

public class VetorDecrescente {

    public static void main(String[] args) {
        int A[] = new int[10];
        int i, j, aux;
        for (i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 50);
        }

        for (i = 0; i < A.length; i++) {
            for (j = i + 1; j < A.length; j++) {
                if (A[i] < A[j]) {

                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }
        }
        System.out.println("Índice \t Vetor Decrescente");
        for (i = 0; i < A.length; i++) {
            System.out.println(+i + " \t " + A[i]);
        }
    }

}
