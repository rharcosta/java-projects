package ex9;

public class Ex9 {

    public static void main(String[] args) {
        int v[] = new int[50];

        System.out.println("Vetor de números aleatórios:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (80 - 0 + 1)) + 0;
            System.out.println(v[i]);
        }
    }
}
