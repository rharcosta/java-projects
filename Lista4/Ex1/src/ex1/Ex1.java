package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int resto;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Este pgm exibe todos os números ímpares situados no intervalo de 1000 a 1500");
        for (int i = 1000; i <= 1500; i++) {
            resto = i % 2;
            if (resto != 0) {
                System.out.println(i);
            }
        }
    }
}
