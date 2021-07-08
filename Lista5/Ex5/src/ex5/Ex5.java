package ex5;

public class Ex5 {

    public static void main(String[] args) {
        int v[] = new int[50];
        System.out.println("Vetor com múltiplos de 5:");
        for (int i = 0; i < v.length; i++) {
            v[i] = 5 + 5 * i;
            System.out.println(v[i]);
        }
    }
}
