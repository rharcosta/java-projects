package ex7;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        String sexo;
        int idade, contribuicao;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Este programa faz o calculo do INSS");
        System.out.print("Qual o seu sexo? ");
        sexo = leitura.nextLine();
        System.out.print("Qual a sua idade? ");
        idade = leitura.nextInt();
        System.out.print("Qual foi tempo de contribuição no INSS? ");
        contribuicao = leitura.nextInt();

        if ("f".equals(sexo) && idade >= 60 && contribuicao >= 15) {
            System.out.println("\nPessoa apta a aposentar-se por idade");
        } else if ("m".equals(sexo) && idade >= 65 && contribuicao >= 15) {
            System.out.println("\nPessoa apta a aposentar-se por idade");
        } else if ("f".equals(sexo) && contribuicao >= 30) {
            System.out.println("\nPessoa apta a aposentar-se por tempo de contribuição");
        } else if ("m".equals(sexo) && contribuicao >= 35) {
            System.out.println("\nPessoa apta a aposentar-se por tempo de contribuição");
        } else {
            System.out.println("\nPessoa não apta a aposentar-se.");
        }
    }
}
