package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        int num, mult;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 9 para a tabuada: ");
        num = leitura.nextInt();
        if ((num < 1) || (num > 9)) {
            System.out.println("Número fora dos padrões estabelecidos.");
        } else {
            for (int i = 0; i <= 10; i++) {
                mult = num * i;
                System.out.println(i + " X " + num + " = " + mult);

            }
        }
    }
}
