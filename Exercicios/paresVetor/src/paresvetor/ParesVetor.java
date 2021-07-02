package paresvetor;

public class ParesVetor {

    public static void main(String[] args) {
        int soma = 0;
        int media, contador = 0;
        double resto;
        int[] numeros = {2, 3, 4, 5};
        System.out.println("Vetor");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            resto = numeros[i] % 2;

            if (resto == 0) {
                soma = soma + numeros[i];
                contador++;
            }
        }
        media = soma / contador;
        System.out.println("\nMédia dos pares = " + media);
    }
}
