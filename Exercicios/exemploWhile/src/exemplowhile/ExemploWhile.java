package exemplowhile;

import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        double num1, num2, res;
        String resp;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        num1 = leitura.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = leitura.nextDouble();

        res = num1 * num2;

        System.out.println("O resultado é: " + res);
        System.out.print("Deseja continuar S/N? ");
        resp = leitura.next();

        while (resp.equals("S")) {
            System.out.print("\nDigite o primeiro número: ");
            num1 = leitura.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = leitura.nextDouble();

            res = num1 * num2;
            System.out.println("O resultado é: " + res);
            System.out.print("Deseja continuar S/N? ");
            resp = leitura.next();
        }
    }
}
