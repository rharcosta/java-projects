package ex1;

public class Ex1 {

    public static void main(String[] args) {                          
        int v[] = new int[50];      
        System.out.println("Vetor com 50 posições: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;                 
            System.out.println(v[i]);
        }
    }
}
