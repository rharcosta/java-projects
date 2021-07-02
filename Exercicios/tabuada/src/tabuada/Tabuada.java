package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero, cont, Resultado = 0;
        int vetor[] = new int[11];

        System.out.println("Programa que calcula a tabuada de um número!");
        System.out.print("Tabuada desejada: ");
        Numero = sc.nextInt();

        for (cont = 0; cont < 11; cont++) {
            vetor[cont] = (int) (Resultado = Numero * cont);
        }
        for (cont = 0; cont < 11; cont++) {
            System.out.println(+Numero + "*" + cont + " = " + vetor[cont]);
        }
    }

}
