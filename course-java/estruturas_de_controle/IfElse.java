package estruturas_de_controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número:");
        int numero = Integer.parseInt(valor);
        if(numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Par");
        }
        else {
            JOptionPane.showMessageDialog(null, "Ímpar");
        }
    }
}
