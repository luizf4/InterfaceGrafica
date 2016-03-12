
package view;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import model.Contas;

/**
 *
 * @author Luiz
 */
public class Inicio {
    
    public static void main(String[] args) {
        /* teste da classe Contas
        Contas operacao = new Contas(0,30);
        
        System.out.println(operacao.soma());
        
        System.out.println(operacao.divisao());
        
        System.out.println(operacao.multiplicacao());
        
        System.out.println(operacao.subtracao());
        */
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
