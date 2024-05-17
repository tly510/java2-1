import java.awt.*;
import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        super("GridLayout 예제")
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(rows:1, cols:10));
        
        for(int i=0; i<10; i++) {

            Stirng text = Intger.toString(i);
            JButton button = new JButton(text);
            contentPane.add(button);

        }
        setSize(width:500, height:200);
        setVisible(true);
        
    }   
    public static void main(String[] args) {
        new GridLayoutEx();
    } 
}
