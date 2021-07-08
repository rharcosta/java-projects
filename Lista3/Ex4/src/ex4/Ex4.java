package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        int num, resultado;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = leitura.nextInt();

        if (num < 0) {
            resultado = num * (-1);
            System.out.println("\nO módulo do número é: " + resultado);
        } else {
            System.out.println("\nO módulo do número é: " + num);
        }
    }
}
