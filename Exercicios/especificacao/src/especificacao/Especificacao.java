package especificacao;

import java.util.Scanner;

public class Especificacao {

    public static void main(String[] args) {
        String resposta, idioma;

        Scanner leitura = new Scanner(System.in);
        System.out.print("A candidata possui idade superior a 19 anos [sim/não]? ");
        resposta = leitura.nextLine();

        if ("sim".equals(resposta)) {
            System.out.print("A candidata fala com fluência dois ou mais idiomas [sim/não]? ");
            idioma = leitura.nextLine();
            if ("sim".equals(idioma)) {
                System.out.println("A candidata atende aos requisitos");
            } else {
                System.out.println("A candidata não se encaixa nos padrões da empresa");
            }
        } else {
            System.out.println("A candidata não se encaixa nos padrões da empresa");
        }
    }
}
