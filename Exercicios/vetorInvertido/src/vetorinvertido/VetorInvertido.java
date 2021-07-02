package vetorinvertido;

public class VetorInvertido {

    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[10];
        int J = 9;
        for (int cont = 0; cont < A.length; cont++) {
            A[cont] = (int) (Math.random() * 50);
            B[J] = A[cont];
            J--;

        }
        System.out.println("Índice \t\tOriginal \t Invertido");
        for (int cont = 0; cont < A.length; cont++) {
            System.out.println(cont + "\t\t" + A[cont] + "\t\t " + B[cont]);
        }
    }

}
