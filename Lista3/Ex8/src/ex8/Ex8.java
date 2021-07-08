package ex8;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        double peso, altura, imc;
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Cálculo de IMC");
        System.out.print("Digite seu peso: ");
        peso = leitura.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = leitura.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("\nVocê está abaixo do peso ideal");
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println("\nParabéns! Você está em seu peso normal");
        } else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.println("\nVocê está acima de seu peso (sobrepeso)");
        } else if ((imc >= 30) && (imc <= 34.9)) {
            System.out.println("\nObesidade grau I");
        } else if ((imc >= 35) && (imc <= 39.9)) {
            System.out.println("\nObesidade grau II");
        } else if (imc >= 40) {
            System.out.println("\nObesidade grau III");
        }
    }
}
