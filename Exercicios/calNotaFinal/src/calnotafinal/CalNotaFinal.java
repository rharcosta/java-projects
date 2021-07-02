package calnotafinal;

import java.util.Scanner;

public class CalNotaFinal {

    public static void main(String[] args) {
        double teste, bim, sem, media;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Este programa calcula sua média final!");
        System.out.print("Digite a nota do seu teste: ");
        teste = leitura.nextDouble();

        System.out.print("Digite sua nota bimestral: ");
        bim = leitura.nextDouble();

        System.out.print("Digite sua nota semestral: ");
        sem = leitura.nextDouble();

        media = ((teste * 0.3) + (bim * 0.3) + (sem * 0.4));

        System.out.println("\nSua média final é: " + media);
    }
}
