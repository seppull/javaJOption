
package pkginterface;

import javax.swing.JOptionPane;


public class Teste1JOptionPane {
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
       String x1 = JOptionPane.showInputDialog(null, "Digite a nota do primeiro");
       double b1 = Double.parseDouble(x1);
       String x2 = JOptionPane.showInputDialog(null, "Digite a nota do segundo");
       double b2 = Double.parseDouble(x2);
       String x3 = JOptionPane.showInputDialog(null, "Digite a nota do terceiro");
       double b3 = Double.parseDouble(x3);
       double media = (b1 + b2 + b3) / 3;
       JOptionPane.showMessageDialog(null,"A media do aluno " + nome + " é " + media, "media" , -1);
       
    }
}
