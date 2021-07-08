package ex6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        double altura, peso, horas;
        int idade;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Ingresso no curso de pilotagem");

        System.out.print("Qual a sua altura? ");
        altura = leitura.nextDouble();
        System.out.print("Qual a sua idade? ");
        idade = leitura.nextInt();
        System.out.print("Qual sua qtd de horas de voo? ");
        horas = leitura.nextDouble();
        System.out.print("Qual o seu peso? ");
        peso = leitura.nextDouble();

        if ((altura >= 1.75) && (idade >= 22 && idade <= 40) && (horas > 1600) && (peso >= 65 && peso <= 95)) {
            System.out.println("\nCandidado apto para o curso.");
        } else {
            System.out.println("\nCandidato não apto para o curso.");
        }

    }

}
