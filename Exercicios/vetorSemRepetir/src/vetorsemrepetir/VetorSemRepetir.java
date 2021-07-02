package vetorsemrepetir;

public class VetorSemRepetir {

    public static void main(String[] args) {
        int A[] = new int[10];
        int i, j;
        for (i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 50);
            for (j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    i--;
                }

            }
        }
        System.out.println("Índice \t Valores");
        for (i = 0; i < A.length; i++) {
            System.out.println(+i + " \t " + A[i]);
        }
    }
}
