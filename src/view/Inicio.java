
package view;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import model.Contas;

/**
 *
 * @author Luiz Fernando de Souza 
 * Matricula: 225272 ADS - EAD SOROCABA
 */
public class Inicio {
    
    public static void main(String[] args) {
        
        NimbusLookAndFeel nimbus = new NimbusLookAndFeel();
        WindowsLookAndFeel win = new WindowsLookAndFeel();
        
        try{
            UIManager.setLookAndFeel(nimbus);
            FrmCalculadora frmCalculadora = new FrmCalculadora();
            frmCalculadora.setVisible(true);
            
        }catch (Exception ex){
            
            JOptionPane.showMessageDialog(null, "Ocorreu um erro \n"
                + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            
        } 
   }
    
}
