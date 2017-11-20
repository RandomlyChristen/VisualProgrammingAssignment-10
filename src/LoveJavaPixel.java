import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoveJavaPixel extends JFrame {

	public LoveJavaPixel() {
		// Constructor : Visual Frame Class
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Declare New Container and Set Layout : FlowLayout
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// New JLable : Initialized for Print "Love Java", Set Default Focus
		JLabel loveLabel = new JLabel("Love Java");
		loveLabel.setFocusable(true);
		// Add KeyListener and Override Methods
		loveLabel.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// Get Previous Font Style and Size
				String originName = loveLabel.getFont().getName();
				int originStyle = loveLabel.getFont().getStyle();
				int originSize = loveLabel.getFont().getSize();
				// if Statements to Size-up OR Size-down
				if (e.getKeyChar() == '+') {
					loveLabel.setFont(new Font(originName, originStyle, originSize + 5));
				}
				if (e.getKeyChar() == '-' && originSize > 5) {
					loveLabel.setFont(new Font(originName, originStyle, originSize - 5));
				}
			}
		});
		
		c.add(loveLabel);
		
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// Construct Instance
		new LoveJavaPixel();
	}

}
