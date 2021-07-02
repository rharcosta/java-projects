package stringfloat;

import javax.swing.JOptionPane;

public class StringFloat {

    public static void main(String[] args) {
        String nota1;
        float n1, n2, m;
        nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        n1 = Float.parseFloat(nota1);
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
        m = (n1 + n2) / 2;
        JOptionPane.showMessageDialog(null, "Média = " + m);
    }

}
