package exemploif;

import java.util.Scanner;

public class ExemploIf {

    public static void main(String[] args) {
        double media;

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite sua média: ");
        media = leitura.nextDouble();

        if (media >= 6) {
            System.out.println("\nAprovado!");
        } else {
            System.out.println("\nReprovado!");
        }
    }
}
