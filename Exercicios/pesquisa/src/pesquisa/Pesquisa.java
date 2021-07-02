package pesquisa;

import java.util.Scanner;

public class Pesquisa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, maior = 0, menor = 0, contIdadeM = 0, contIdadeF = 0, contM = 0, contF = 0;
        float salario, salM = 0, salF = 0, medSalM, medSalF;
        String sexo;

        while (true) {
            System.out.print("\nDigite sua idade [pressione 0 para sair]: ");
            idade = sc.nextInt();
            if (idade == 0) {
                break;
            }
            System.out.print("Informe seu sexo [F/M]: ");
            sexo = sc.next();

            System.out.print("Insira seu salário: R$");
            salario = sc.nextFloat();

            if (("M".equals(sexo)) && (idade >= 20)) {
                contIdadeM++;
            } else if (("F".equals(sexo)) && (idade < 18)) {
                contIdadeF++;
            }
            if ("M".equals(sexo)) {
                contM++;
                salM += salario;
            } else if ("F".equals(sexo)) {
                contF++;
                salF += salario;
            }
            if ((maior == 0) && (menor == 0)) {
                maior = idade;
                menor = idade;
            } else if (idade > maior) {
                maior = idade;

            } else if (idade < menor) {
                menor = idade;
            }
        }

        medSalM = salM / contM;
        medSalF = salF / contF;
        System.out.println("\nQuantidade de homens com idade igual ou maior que 20 anos: " + contIdadeM);
        System.out.println("Quantidade de mulheres com idade menor que 18 anos: " + contIdadeF);
        System.out.println("Maior idade do grupo: " + maior);
        System.out.println("Menor idade do grupo: " + menor);
        System.out.println("Média de salário dos homens: " + medSalM);
        System.out.println("Média de salário das mulheres: " + medSalF);
    }
}
