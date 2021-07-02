package divisaonumero;

import java.util.Scanner;

public class DivisaoNumero {

    public static void main(String[] args) {
        double num;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = leitura.nextDouble();

        do {
            num = num / 2;
            System.out.println(num);
        } while (num >= 1);
        System.out.println("Fim do programa");
    }
}
