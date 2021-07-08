package ex9;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        int codigo;
        double preco;

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        preco = leitura.nextDouble();
        System.out.print("Digite seu código de origem: ");
        codigo = leitura.nextInt();
        System.out.println("Preço " + preco);

        if (codigo == 1) {
            System.out.println("Sul");
        } else if (codigo == 2) {
            System.out.println("Norte");
        } else if (codigo == 3) {
            System.out.println("Leste");
        } else if (codigo == 4) {
            System.out.println("Oeste");
        } else if ((codigo == 5) || (codigo == 6)) {
            System.out.println("Nordeste");
        } else if ((codigo == 7) || (codigo == 8) || (codigo == 9)) {
            System.out.println("Sudeste");
        } else if ((codigo > 10) && (codigo < 20)) {
            System.out.println("Centro - oeste");
        } else if ((codigo > 25) && (codigo < 30)) {
            System.out.println("Nordeste");
        } else {
            System.out.println("Produto importado");
        }
    }
}
