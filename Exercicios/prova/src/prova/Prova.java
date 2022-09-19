package prova;

public class Prova {

    public static void main(String[] args) {
        double resto, soma = 0, soma2 = 0, cont = 0, cont2 = 0, par, impar;
        int aux, max = 15, min = 120;
        int v[] = new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (120 - 15 + 1)) + 15;
        }

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }
        System.out.println("O maior valor é: " + max);
        System.out.println("O menor valor é: " + min);
        
         for (int i = 0; i < v.length; i++) {
            if (v[i]%2 == 0) {
                soma = soma + v[i];
                cont++;
            } else {
                soma2 = soma2 + v[i];
                cont2++;
            }
            
        }        
        par = soma/cont;
        impar = soma2/cont2;         
        
        
        System.out.println("Média dos pares: " + par);
        System.out.println("Média dos impares: "+impar);

    }

}
