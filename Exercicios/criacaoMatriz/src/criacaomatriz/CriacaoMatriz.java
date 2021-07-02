package criacaomatriz;

public class CriacaoMatriz {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 5;
                if (i == j) {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
