import java.swing
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;

import java.awt*;


public class ContentPanEx {
    public ContentPanEx() {
        setTitle("ContentPane과 JFrame 예제"); //프레임 타이트달기
        setDefaultCloseOperation(JFrame_EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));
        
        setSize(300, 150); // 프레임 크기 300x150 설정
		setVisible(true); // 화면에 프레임 출력
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}