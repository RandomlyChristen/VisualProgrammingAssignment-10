import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoveJavaCycle extends JFrame {
	
	String labelString = "Love Java";
	
	public LoveJavaCycle() {
		// Constructor : Visual Frame Class
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Declare New Container and Set Layout : FlowLayout
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// New JLable : Initialized for Print "Love Java", Set Default Focus
		JLabel loveLabel = new JLabel(labelString);
		loveLabel.setFocusable(true);
		// Add KeyListener and Override Methods
		loveLabel.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// Anonymous Class`s method - KeyPressed Event Method
				// if Statement to get specific Key Action : LEFT PRESSED
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// Initialize this Member Variable with Below method "cycleString()"
					labelString = cycleString(labelString);
					loveLabel.setText(cycleString(labelString));
				}
			}
		});
		
		c.add(loveLabel);
		setSize(200, 100);
		setVisible(true);
	}
	
	String cycleString(String string) {
		// Get Parameter String`s substring Array
		String[] substringArray = new String[string.length()];
		for (int i = 0; i < string.length(); i ++) {
			substringArray[i] = string.substring(i, i + 1);
		}
		String returnString = "";
		for (int i = 1; i < substringArray.length; i ++) {
			returnString = returnString + substringArray[i];
		}
		// Return String : the last occurrence of the Substring is the 0 Index of the Original String.
		returnString = returnString + substringArray[0];
		
		return returnString;
	}

	public static void main(String[] args) {
		// Construct Instance
		new LoveJavaCycle();
	}

}
