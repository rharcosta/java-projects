package ex2;

public class Ex2 {

    public static void main(String[] args) {
        int a[] = new int[50];
        System.out.println("Vetor com 50 posições:");
        for (int i = 0; i < a.length; i++) {
            a[i] = 50 - i;
            System.out.println(a[i]);
        }
    }
}
