package ex18;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        int x, soma = 0, y = 7;
        int v[] = new int[8];
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite oito dígitos binários [0 ou 1]");
        for (int i = 0; i < v.length; i++) {
            System.out.print(i+1 + "º Dígito: ");
            v[i] = leitura.nextInt();
            x = (int) ((Math.pow(2, y)) * v[i]);
            soma = soma + x;
            y--;
        }
        System.out.println("\nO número decimal é: " + soma);
    }
}
