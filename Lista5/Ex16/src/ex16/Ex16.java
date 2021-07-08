package ex16;

public class Ex16 {

    public static void main(String[] args) {
        int contMenor = 0, contMaior = 0;
        int v[] = new int[80];

        System.out.println("Vetor de 80 posições com números aleatórios entre 0 e 9:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (9 - 0 + 1)) + 0;
            if (v[i] < 5) {
                contMenor++;
            } else {
                contMaior++;
            }
            System.out.print(v[i] + "\t");
        }
        System.out.println("");
        System.out.println("\nNúmeros menores que 5: " + contMenor);
        System.out.println("Números maiores ou iguais a 5: " + contMaior);
    }
}
