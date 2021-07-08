package ex3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        int num;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Fatorial de um número");
        System.out.print("Digite um número: ");
        num = leitura.nextInt();
        System.out.println("\nSeu fatorial é: " + fact(num));
    }

    public static int fact(int i) {
        if (i == 0) {
            return 1;
        }
        return i * fact(i - 1);
    }
}
