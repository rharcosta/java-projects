package ex5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        int raio;
        double comprimento;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Este programa calcula o comprimento de uma circunferência");
        System.out.print("Digite o raio: ");
        raio = leitura.nextInt();

        DecimalFormat df = new DecimalFormat("#,###.00");
        comprimento = (2 * Math.PI * raio);

        System.out.println("\nO comprimento é: " + df.format(comprimento));
    }
}
