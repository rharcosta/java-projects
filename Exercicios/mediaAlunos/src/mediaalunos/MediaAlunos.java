package mediaalunos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Definir o tamanho da variavel float: DecimalFormat df //variável = new Decimalformat ("0.0");
        System.out.println("Media="+df.format(m));
         */
        DecimalFormat df = new DecimalFormat("0.0");
        //Declaração de variáveis
        float nota1, nota2, nota3, media, nova_media, mediaf;
        int cont, cont1, cont2 = 0, cont3 = 0, cont4 = 0, acum = 0;
        //Entrada de dados
        System.out.println("Bem vindo ao Programa Java");
        System.out.println("Este programa calcula a média de um aluno");
        System.out.print("Quantos alunos deseja digitar? ");
        cont1 = sc.nextInt();

        for (cont = 1; cont <= cont1; cont++) {
            System.out.println("\nAluno: " + cont);
            System.out.print("Digite a primeira nota: ");
            nota1 = sc.nextFloat();

            while ((nota1 < 0) || (nota1 > 10)) {
                System.out.print("Digite a primeira nota: ");
                nota1 = sc.nextFloat();
            }

            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextFloat();

            while ((nota2 < 0) || (nota2 > 10)) {
                System.out.print("Digite a segunda nota: ");
                nota2 = sc.nextFloat();
            }

            media = (nota1 + nota2) / 2;
            if (media >= 6) {
                System.out.println("Aluno aprovado com sucesso com a média: " + df.format(media));
                cont2++;
                acum += media;
            } else {
                System.out.println("Aluno reprovado com a média: " + df.format(media));
                System.out.print("Insira a nova nota de recuperação: ");
                nota3 = sc.nextFloat();
                nova_media = (media + nota3) / 2;
                if (nova_media >= 5) {
                    System.out.println("Aluno aprovado com recuperação com a média: " + df.format(nova_media));
                    cont3++;
                    acum += nova_media;
                } else {
                    System.out.println("Aluno reprovado de ano com a média: " + df.format(nova_media));
                    cont4++;
                    acum += nova_media;

                }
            }
        }
        mediaf = acum / cont1;
        System.out.println("\nQntd de alunos aprovados: " + cont2);
        System.out.println("Qntd de alunos aprovados na recuperação: " + cont3);
        System.out.println("Qntd de alunos reprovados: " + cont4);
        System.out.println("Média final de todos os alunos: " + df.format(mediaf));
        System.out.println("\nFim do programa");
    }

}
