package ex4;

public class Ex4 {

    public static void main(String[] args) {
        int v[] = new int[50];
        System.out.println("Vetor com números ímpares:");
        for (int i = 0; i < v.length; i++) {
            v[i] = 3 + 2 * i;
            System.out.println(v[i]);
        }
    }
}
