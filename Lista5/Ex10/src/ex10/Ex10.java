package ex10;

public class Ex10 {

    public static void main(String[] args) {
        int v[] = new int[50];
        System.out.println("Vetor com números aleatórios de 27 a 248:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (248 - 27 + 1)) + 27;
            System.out.println(v[i]);
        }
    }
}
