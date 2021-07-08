package ex14;

public class Ex14 {

    public static void main(String[] args) {
        int v[] = new int[100];
        int i, j, aux;

        for (i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (200 - 1 + 1)) + 1;
        }
        
        for (i = 0; i < v.length; i++) {
            for (j = i + 1; j < v.length; j++) {
                if (v[j] == v[i]) {                 //Se o núm for igual seu antecedor...
                    v[j] = (int) (Math.random() * (200 - 1 + 1)) + 1;  //Gerar outro número
                    j = 0;
                    i = 0;
                }
            }
        }
        
        for (i = 0; i < v.length; i++) {
            for (j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        
        System.out.println("Vetor aleatório com números entre 1 e 200 sem repetição:");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println("");
    }
}
