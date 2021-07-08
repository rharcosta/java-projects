package ex6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        int raio;
        double volume;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Esse programa calcula o volume de uma esfera");
        System.out.print("Digite o raio: ");
        raio = leitura.nextInt();

        DecimalFormat df = new DecimalFormat("#,###.00");
        volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;

        System.out.println("\nO volume da esfera é: " + df.format(volume));
    }
}
