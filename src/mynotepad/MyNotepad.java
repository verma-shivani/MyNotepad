
package mynotepad;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JTextArea;


public class MyNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NotepadFrame frame=new NotepadFrame();
        frame.setVisible(true);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0,0,screenSize.width, screenSize.height);
        JTextArea jTextArea1 = new JTextArea();
         jTextArea1.setSize(screenSize.width, screenSize.height);
        
                
        
    }
    
}
