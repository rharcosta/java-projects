package ex17;

public class Ex17 {

    public static void main(String[] args) {
        int total = 21, consumo = 0; //Número total de peças 
        int qtd[] = {150, 132, 121, 145, 134, 187, 199, 191, 188, 156, 212, 244};
        int matriz[][] = new int[12][4];

        System.out.println("Consumo por mês");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                consumo = qtd[i] / total;
                matriz[i][j] = consumo;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
