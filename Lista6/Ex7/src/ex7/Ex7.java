package ex7;

public class Ex7 {

    public static void main(String[] args) {
        int k = 1;
        int matriz[][] = new int[4][5];

        System.out.println("Matriz carregada com 1,2,3,4,...:");
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
