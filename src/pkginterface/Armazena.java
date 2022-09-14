
package pkginterface;

import javax.swing.JOptionPane;


public class Armazena {
    public static void main(String[] args) {
       String x1 = JOptionPane.showInputDialog(null, "Digite o valor de A");
       double a = Double.parseDouble(x1);
       String x2 = JOptionPane.showInputDialog(null, "Digite o valor de B");
       double b = Double.parseDouble(x2);
       double c1 = (a + b);
       double c2 = (a - b);
       double c3 = (a * b);
       double c4 = (a / b);
       
       JOptionPane.showMessageDialog(null,"O resultado dos calculos é: \n" + a + " + " + b + " = " + c1 + "\n" + a + " - " + b + " = " + c2 + "\n" + a + " x " + b + " = " + c3 + "\n" + a + " / " + b + " = " + c4 ,"Resultado" , -1);
       
    }
    
}
