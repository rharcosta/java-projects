package ex4;

public class Ex4 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][5];

        System.out.println("Matriz com todos os valores iguais a i+1:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = i + 1;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
