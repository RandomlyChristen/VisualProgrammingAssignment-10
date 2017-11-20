import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RandomClick extends JFrame {
	
	int x; int y;
	JLabel cLable;

	public RandomClick() {
		setTitle("클릭 연습 용 응용 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		// Set null to Deployment Manager
		container.setLayout(null);
		// New JLable : Initialized for Print "C", Set Default Location
		this.x = 100; this.y = 100;
		cLable = new JLabel("C");
		cLable.setLocation(this.x, this.y);
		cLable.setSize(20, 20);
		// Add MouseListener and Override Methods
		cLable.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// Anonymous Class`s method - MousePressed Event Method
				// Set Location of Label with Initialized 'x', 'y' : Random value
				x = (int)(Math.random() * 200) + 50;
				y = (int)(Math.random() * 200)+ 50;
				cLable.setLocation(x, y);		
			}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		
		container.add(cLable);
		
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		// Construct Instance
		new RandomClick();
	}

}
