package ex13;

public class Ex13 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][5];
        int v[] = new int[20];
        int i, j, k = 0;

        System.out.println("Vetor com números entre 31 e 80:");
        for (i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (80 - 31 + 1)) + 31;
            System.out.print(v[i] + "\t");
        }
        System.out.println("");

        System.out.println("\nMatriz com os valores do vetor:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = v[k];
                System.out.print(matriz[i][j] + "\t");
                k++;
            }
            System.out.println("");
        }
    }
}
