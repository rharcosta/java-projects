package ex3;

public class Ex3 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][5];

        System.out.println("Matriz com todos os valores iguais a j:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = j;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
