import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class FlowLayoutEx extends JFrame {
    public FlowrLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContenpane();

        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, hgap:30, vgap:40));

        contentPane.add(new JButton("add.Calculate"));
        contentPane.add(new JButton("sub-Calculate"));
        contentPane.add(new JButton("mul-Calculate"));
        contentPane.add(new JButton("div-Calculate"));
        contentPane.add(new JButton("Calculate.Calculate"));
        
        setSize(width:300,)
        

    }
    
}
