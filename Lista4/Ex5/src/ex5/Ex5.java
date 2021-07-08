package ex5;

public class Ex5 {

    public static void main(String[] args) {
        int potencia, i;
        System.out.println("Potência de 2");
        for (i = 0; i < 1000; i++) {
            potencia = (int) Math.pow(2, i);
            if (potencia < 1000) {
                System.out.println("2 ^ " + i + " = " + potencia);
            }
        }
    }
}
