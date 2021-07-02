package exemplomatriz;

public class ExemploMatriz {

    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        //int numLinhas = matriz.length;
        //int numcolunas = matriz[0].length; 
        for (int i = 0; i < matriz.length; i++) { //Percorrendo as linhas

            for (int j = 0; j < matriz[0].length; j++) { //Percorrendo as colunas

                //if (matriz[i] == matriz[j]) {   //Elementos da matriz principal
                if (i + j < matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
                //}
            }
            System.out.println("");
        }
    }
}
