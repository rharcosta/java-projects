package ex6;

public class Ex6 {

    public static void main(String[] args) {
        int resto, soma = 0, i;
        System.out.println("Somatória de todos os números pares entre 1 e 1001:");
        for (i = 1; i <= 1001; i++) {
            resto = i % 2;
            if (resto == 0) {
                soma = soma + i;
            }
        }
        System.out.println("\nSoma = " + soma);
    }
}
