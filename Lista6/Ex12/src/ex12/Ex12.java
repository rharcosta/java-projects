package ex12;

public class Ex12 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][5];
        int v[] = new int[20];
        int k = 0, i, j;

        System.out.println("Matriz com números entre 1 e 50:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * (50 - 1 + 1)) + 1;
                v[k] = matriz[i][j];
                k++;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nVetor com os valores da matriz:");

        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println("");
    }
}
