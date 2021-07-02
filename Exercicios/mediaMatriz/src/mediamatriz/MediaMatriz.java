package mediamatriz;

public class MediaMatriz {

    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        double media, soma = 0;
        int cont = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; i < matriz[0].length; j++) {
                soma = soma + matriz[i][j];
                cont++;
            }
        }
        media = soma / cont;
        System.out.println("Media dos números" + media);
    }
}