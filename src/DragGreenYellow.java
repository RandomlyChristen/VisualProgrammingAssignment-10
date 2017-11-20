import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class DragGreenYellow extends JFrame {
	
	// Declaration of Mouse Movement Flag and Thread
	Thread mouseCheckThread;
	boolean isMouseMoved = false;
	
	public DragGreenYellow() {
		// Constructor : Visual Frame Class
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set Default Color : GREEN
		getContentPane().setBackground(Color.GREEN);
		
		// Add MouseListener and Override Methods
		getContentPane().addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// Anonymous Class`s method - MouseReleased Event Method
				getContentPane().setBackground(Color.GREEN);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		
		// Add MouseMotionListener and Override Methods
		getContentPane().addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// Anonymous Class`s method - MouseMoved Event Method
				isMouseMoved = true;
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// Anonymous Class`s method - MouseDragged Event Method
				getContentPane().setBackground(Color.YELLOW);
			}
		});
		
		// Thread for Checking MouseMovement
		mouseCheckThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				while (true) {
					isMouseMoved = false;
					// Set MouseMovement Flag : Stopped
					try {
						// Wait For User MouseStatus,
						// if MouseMoved, Flag will be initialized with fresh Status 
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// Catch Block for Thread Interrupted Exception
						e.printStackTrace();
					}
					// if, There are NOT new Mouse Movement for 100ms, 
					if (!isMouseMoved) {
						// Set Background GREEN
						getContentPane().setBackground(Color.GREEN);
					}
				}
			}
		});
		mouseCheckThread.start();
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// Construct Instance
		new DragGreenYellow();

	}

}
