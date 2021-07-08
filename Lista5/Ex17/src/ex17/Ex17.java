package ex17;

public class Ex17 {

    public static void main(String[] args) {
        int i, max = 7, min = 3756;
        int v[] = new int[200];

        System.out.println("Vetor com números aleatórios entre 7 e 3756: ");
        for (i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (3756 - 7 + 1)) + 7;
            System.out.print(v[i] + "\t");
        }

        for (i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }
        System.out.println("");
        System.out.println("\nValor mínimo: " + min);
        System.out.println("Valor máximo: " + max);
    }
}
