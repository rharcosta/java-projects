package binario;

import java.util.Scanner;

public class Binario {

    public static void main(String[] args) {
        int num, binario;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número na base decimal");
        System.out.print("Leitura de baixo para cima: ");
        num = leitura.nextInt();

        do {
            binario = num % 2;
            System.out.println(binario);
            num = num / 2;
        } while (num >= 2);

        System.out.println(num);
    }
}
