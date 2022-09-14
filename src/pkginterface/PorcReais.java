
package pkginterface;

import javax.swing.JOptionPane;


public class PorcReais {
    public static void main(String[] args){
        String x1 = JOptionPane.showInputDialog(null, "Digite um valor");
       double val = Double.parseDouble(x1);
       double resul = val * 0.1;
       JOptionPane.showMessageDialog(null,"10% de " + val + " é igual a: " + resul ,"Resultado" , -1);
    }
    
}
