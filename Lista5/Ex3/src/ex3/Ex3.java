package ex3;

public class Ex3 {

    public static void main(String[] args) {
        int v[] = new int[50];
        System.out.println("Vetor de números pares:");
        for (int i = 0; i < v.length; i++) {
            v[i] = 2 + 2 * i; // Soma 2 pq tem que começar pelo 2; 
            System.out.println(v[i]);
        }
    }
}
