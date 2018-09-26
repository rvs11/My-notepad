
package javaapplication15;
import javax.swing.JFrame;
public class JavaApplication15 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        texteditorGui obj = new texteditorGui();
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("My Notepad");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
