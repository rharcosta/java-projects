package tresvetores;

import java.util.Scanner;

public class TresVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Vetor1[] = new int[5];
        int Vetor2[] = new int[5];
        int Vetor3[] = new int[5];
        int cont, Numero = 1, Elementos, R;
        System.out.println("Digite um número entre 10 e 30");
        for (cont = 0; cont < Vetor1.length; cont++) {
            System.out.print(+Numero + "º Número: ");
            Elementos = sc.nextInt();
            while ((Elementos < 10) || (Elementos > 30)) {
                System.out.println("Valor não aceito! Digite novamente:");
                Elementos = sc.nextInt();
            }
            Vetor1[cont] = Elementos;
            Numero++;
        }
        for (cont = 0; cont < Vetor2.length; cont++) {
            Vetor2[cont] = (int) (40 + Math.random() * 30);
        }
        for (cont = 0; cont < Vetor3.length; cont++) {
            Vetor3[cont] = Vetor1[cont] + Vetor2[cont];
            System.out.println(+Vetor1[cont] + " + " + Vetor2[cont] + " = " + Vetor3[cont]);
        }
    }

}
