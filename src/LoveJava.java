import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoveJava extends JFrame {

	public LoveJava() {
		// Constructor : Visual Frame Class
		setTitle("마우스 올리기 내리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Declare New Container and Set Layout : FlowLayout
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		// New JLable : Initialized for Print "사랑해"
		JLabel loveLabel = new JLabel("사랑해");
		// Add MouseListener and Override Methods
		loveLabel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// Anonymous Class`s method - MouseExited Event Method
				loveLabel.setText("사랑해");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// Anonymous Class`s method - MouseEntered Event Method
				loveLabel.setText("Love Java");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		
		c.add(loveLabel);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// Construct Instance
		new LoveJava();

	}
	
}
