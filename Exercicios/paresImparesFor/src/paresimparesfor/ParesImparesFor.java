package paresimparesfor;

public class ParesImparesFor {

    public static void main(String[] args) {
        int resto;
        System.out.println("Exibição de números pares");
        for (int i = 1000; i <= 1500; i++) {
            resto = i % 2;
            if (resto == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\nExibição de números ímpares");
        for (int j = 1000; j <= 1500; j += 2) {
            System.out.println(j);
        }
    }
}
