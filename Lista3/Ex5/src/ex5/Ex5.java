package ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Este programa mostra a diferença entre dois números inteiros");
        System.out.print("Digite o primeiro número: ");
        num1 = leitura.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = leitura.nextInt();

        if (num1 > num2) {
            resultado = num1 - num2;
            System.out.println("\nA diferença entre os números é de: " + resultado);
        } else if (num2 > num1) {
            resultado = num2 - num1;
            System.out.println("\nA diferença entre os números é de: " + resultado);
        } else {
            System.out.println("\nOs números são iguais");
        }
    }
}
