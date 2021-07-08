package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        String nome;
        int ra;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.print("Digite seu RA: ");
        ra = leitura.nextInt();

        System.out.println("\n" + ra + " - " + nome);
    }
}
