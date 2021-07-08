package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        int idade, idiomas;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = leitura.nextInt();
        System.out.print("Quantos idiomas você fala? ");
        idiomas = leitura.nextInt();

        if ((idade >= 19) && (idiomas >= 2)) {
            System.out.println("\nA candidata atende os requisitos");
        } else {
            System.out.println("\nA candidata não atende os requisitos");
        }
    }
}
