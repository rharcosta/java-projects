package ex10;

public class Ex10 {

    public static void main(String[] args) {
        int k = 19;
        int matriz[][] = new int[4][5];

        System.out.println("Matriz carregada com 19,18,17,16,...:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = k;
                System.out.print(matriz[i][j] + "\t");
                k--;
            }
            System.out.println("");
        }
    }
}
