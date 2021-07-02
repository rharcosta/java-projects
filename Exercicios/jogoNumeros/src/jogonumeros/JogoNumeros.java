package jogonumeros;

import java.util.Scanner;

public class JogoNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R, num, cont = 0;

        R = (int) (1 + Math.random() * 100);
        System.out.print("Digite um número entre 1 e 100: ");
        num = sc.nextInt();
        while ((num < 1) || (num > 100)) {
            System.out.print("Digite um número entre 1 e 100: ");
            num = sc.nextInt();
        }
        cont++;

        do {
            if (num > R) {
                System.out.println("Número maior que o número randômio");
                cont++;
                System.out.print(+cont + "º Tentativa: ");
                num = sc.nextInt();
            }
            if (num < R) {
                System.out.println("Número menor que o número randômio");
                cont++;
                System.out.print(+cont + "º Tentativa: ");
                num = sc.nextInt();
            }
        } while (num != R);
        System.out.println("Parabéns! Número compatível em " + cont + " tentativas");
        System.out.println("Número que foi gerado: " + R);
    }
}
