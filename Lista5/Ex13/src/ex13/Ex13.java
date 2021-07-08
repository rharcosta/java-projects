package ex13;

public class Ex13 {

    public static void main(String[] args) {
        int aux;
        int v[] = new int[100];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (370 - 9 + 1)) + 9;
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] > v[i]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        System.out.println("Vetor decrescente com números aleatórios entre 9 e 370:");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
