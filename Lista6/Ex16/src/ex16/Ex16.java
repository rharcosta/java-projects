package ex16;

public class Ex16 {

    public static void main(String[] args) {
        int aux, k = 0;
        int m[][] = new int[3][4];
        int v[] = new int[12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int) (Math.random() * (30 - 0 + 1)) + 0;
                v[k] = m[i][j];
                k++;
            }
        }

        for (k = 0; k < v.length; k++) {
            for (int j = k + 1; j < v.length; j++) {
                if (v[j] > v[k]) {
                    aux = v[k];
                    v[k] = v[j];
                    v[j] = aux;
                }
            }
        }
        k = 0;
        System.out.println("Matriz decrescente com números aleatórios entre 0 e 30:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = v[k];
                k++;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
