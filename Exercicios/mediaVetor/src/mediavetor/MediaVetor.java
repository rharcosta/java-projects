package mediavetor;

public class MediaVetor {

    public static void main(String[] args) {
        int soma = 0;
        float media;
        int[] numeros = {2, 4, 6, 8};
        System.out.println("Vetor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            soma = (soma + numeros[i]);
        }
        media = soma / numeros.length;
        System.out.println("\nMédia = " + media);
    }
}
