
package pkginterface;

import javax.swing.JOptionPane;

public class Interface {

   
    public static void main(String[] args) {
       String x = JOptionPane.showInputDialog(null, "Digite algo");
       int valor = Integer.parseInt(x);
       double valor2 = Double.parseDouble(x);
       JOptionPane.showMessageDialog(null, x);
        
    }
    
}
