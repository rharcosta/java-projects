package somavetor;

public class SomaVetor {

    public static void main(String[] args) {
        int soma = 0;
        int[] numeros = {2, 4, 6, 8};
        System.out.println("Vetor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            soma = soma + numeros[i];
        }
        System.out.println("\nSoma dos números = " + soma);
    }

}
