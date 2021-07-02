package vetoraleatorio;

public class VetorAleatorio {

    public static void main(String[] args) {
        //Vetor com 20 posições
        int a[] = new int[20];

        System.out.println("Vetor");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (80 - 0 + 1) + 0);
            System.out.println(a[i] + "\t");
        }
    }
}
