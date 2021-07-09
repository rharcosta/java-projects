package ex8;

public class Ex8 {

    public static void main(String[] args) {
        int k = 10;
        int matriz[][] = new int[4][5];

        System.out.println("Matriz carregada com 10,11,12,13,...:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = k;
                System.out.print(matriz[i][j] + "\t");
                k++;
            }
            System.out.println("");
        }
    }
}
