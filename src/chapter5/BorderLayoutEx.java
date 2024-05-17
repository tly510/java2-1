import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayout() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new BorderLayout());
    }
}
