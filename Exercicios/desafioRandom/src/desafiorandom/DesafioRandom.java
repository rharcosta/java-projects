package desafiorandom;

import java.util.Scanner;

public class DesafioRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ran, contpar = 0, contimpar = 0, acum = 0, cont = 0;
        float mg, r;
        System.out.print("Digite um numero entre 1 e 100: ");
        n = sc.nextInt();
        while ((n < 1) || (n > 100)) {
            System.out.print("Digite um número padrão: ");
            n = sc.nextInt();
        }
        do {
            ran = (int) (1 + Math.random() * 100);
            r = ran % 2;
            if (r == 0) {
                contpar++;
            }
            if (r != 0) {
                contimpar++;
            }
            acum = acum + ran;
            cont++;
        } while (ran != n);

        mg = acum / cont;
        System.out.println("\nQuantidade de números gerados até acertar: " + cont);
        System.out.println("Quantidade de números pares gerados: " + contpar);
        System.out.println("Quantidade de números impares gerados: " + contimpar);
        System.out.println("Média aritmética de todos os números gerados: " + mg);
    }

}
