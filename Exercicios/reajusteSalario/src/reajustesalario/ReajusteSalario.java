package reajustesalario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReajusteSalario {

    public static void main(String[] args) {
        double sal, reajuste;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Cálculo de reajuste de salário");

        System.out.print("Digite o valor do seu salário: ");
        sal = leitura.nextDouble();

        if (sal < 500) {
            reajuste = (sal * 1.15);
        } else if (sal <= 1000) {
            reajuste = (sal * 1.10);
        } else {
            reajuste = (sal * 1.05);
        }

        DecimalFormat df = new DecimalFormat("#,###.00");
        df.format(reajuste);

        System.out.println("O valor do novo salário é: " + reajuste);
    }
}
