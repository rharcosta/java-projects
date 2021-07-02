package encontreimatriz;

import java.util.Scanner;

public class EncontreiMatriz {

    public static void main(String[] args) {
        int valor, cont = 0;
        int matriz[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o valor que você gostaria de procurar: ");
        valor = leitura.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (valor == matriz[i][j]) {
                    System.out.println("\nAchei na linha " + i + " e na coluna " + j);
                    cont++;
                }
            }
        }
        if (cont == 0){
            System.out.println("Valor não encontrado!");
        }
    }
}
