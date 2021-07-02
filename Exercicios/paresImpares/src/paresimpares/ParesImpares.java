package paresimpares;

import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont, acum = 0, acum2 = 0, acum3 = 0, acum4 = 0, nota, resto;
        float mediap = 0, mediai = 0;
        System.out.print("Quantos números deseja digitar? ");
        num = sc.nextInt();
        for (cont = 1; cont <= num; cont++) {
            System.out.println("Número " + cont);
            nota = sc.nextInt();
            resto = nota % 2; //% Resto da divisão 

            if ((resto == 0) || (resto == 2) || (resto == 4) || (resto == 6) || (resto == 8)) {
                acum++;
                acum3 = acum3 + nota;
            } else {
                acum2++;
                acum4 = acum4 + nota;
            }
        }

        if (acum != 0) {
            mediap = acum3 / acum;
        }
        if (acum2 != 0) {
            mediai = acum4 / acum2;
        }

        System.out.println("Qntd de Números Pares: " + acum);
        System.out.println("Qntd de Números Ímpares: " + acum2);
        System.out.println("Média aritmética dos pares: " + mediap);
        System.out.println("Média aritmética dos ímpares: " + mediai);
    }
}
