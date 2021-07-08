package ex3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        double peso, excedente, taxa;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o peso do peixe: ");
        peso = leitura.nextDouble();

        if (peso > 50) {
            excedente = peso - 50;
            taxa = excedente * 4;
            System.out.println("\nTaxa de: " + taxa + " reais");
        } else {
            System.out.println("\nPeixe isento de taxa");
        }
    }
}
