package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int num, resto;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite somente números inteiros");
        System.out.print("Digite um número: ");
        num = leitura.nextInt();
        resto = num % 2;

        if (resto == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }
}
