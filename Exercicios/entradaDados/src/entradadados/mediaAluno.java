package entradadados;

import java.util.Scanner;

public class mediaAluno {

    public static void main(String[] args) {
        
        Scanner var = new Scanner(System.in);
        float nota1, nota2, media;
        System.out.println("Bem-Vindo ao Programa Média Java");
        System.out.print("Insira a primeira nota: ");
        nota1 = var.nextFloat();
        System.out.print("Insira a segunda nota: ");
        nota2 = var.nextFloat();
        media = (nota1 + nota2) / 2;
        System.out.println("O aluno ficou com media = " + media);
    }
}
