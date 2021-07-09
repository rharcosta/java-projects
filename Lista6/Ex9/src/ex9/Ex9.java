package ex9;

public class Ex9 {

    public static void main(String[] args) {
        int k = 10;
        int matriz[][] = new int[4][5];

        System.out.println("Matriz carregada com 10,20,30,40,...:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = k;
                System.out.print(matriz[i][j] + "\t");
                k += 10;
            }
            System.out.println("");
        }
    }
}
