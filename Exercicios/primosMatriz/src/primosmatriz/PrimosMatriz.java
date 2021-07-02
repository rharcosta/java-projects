package primosmatriz;

public class PrimosMatriz {

    public static void main(String[] args) {
        int matriz[][] = new int[6][6];
        boolean a = false;
        int r, x = 2, contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * (100 - 0 + 1)) + 0;
                System.out.print(matriz[i][j] + "\t");

                while (x < matriz[i][j]) {
                    r = matriz[i][j] % x;
                    if (r == 0) {
                        a = true;
                    }
                    x = x + 1;
                }
                if (a == false) {
                    contador = contador + 1;
                }
                x = 2;
                a = false;
            }
            System.out.println("");
        }
        System.out.println("\nQuantidade de números primos: " + contador);
    }
}
