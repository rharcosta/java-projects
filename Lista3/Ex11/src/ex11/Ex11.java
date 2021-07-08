package ex11;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int temp;

        System.out.println("Cálculo de temperatura");
        System.out.print("Digite o valor da temperatura: ");
        temp = leitura.nextInt();

        if (temp > 32) {
            System.out.println("\nMuito quente");
        } else if ((temp >= 25) && (temp < 32)) {
            System.out.println("\nQuente");
        } else if ((temp >= 14) && (temp < 25)) {
            System.out.println("\nModerada");
        } else if ((temp >= 8) && (temp < 14)) {
            System.out.println("\nFrio");
        } else if ((temp >= -2) && (temp < 8)) {
            System.out.println("\nMuito frio");
        } else if ((temp >= -12) && (temp < -2)) {
            System.out.println("\nExtremamente frio");
        } else if (temp < -12) {
            System.out.println("\nCongelante");
        }
    }
}
