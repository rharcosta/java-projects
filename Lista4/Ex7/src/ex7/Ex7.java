package ex7;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int n, r, controle = 0, x = 2;
        System.out.print("Digite um número: ");
        n = leitura.nextInt();

        while (x < n) {
            r = n % x;
            if (r == 0) {
                controle = 1;
            }
            x = x + 1;
        }
        if (controle == 1) {
            System.out.println("Não é primo");
        } else {
            System.out.println("É primo");
        }
    }
}
