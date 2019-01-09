package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
/**
 * Displays the start screen for the user
 * @author rithika
 *
 */
public class StartPanel extends JPanel implements ActionListener{

	private Main w;
	private Image background;
	private JButton button;
	
	/**
	 * Creates a StartPanel that the user sees first
	 * @post background with pianoBckgrd.png picture
	 * 		Layout is null
	 * 		Play button is created: Its font is Sans, bold, and 40 pt.   
	 * @param w Main object that uses this StartPanel object
	 */
	public StartPanel(Main w) {
		this.w = w;
		 background = (new ImageIcon("pianoBckgrd.png")).getImage();
		 setLayout(null);
			Font font = new Font("Sans", Font.BOLD, 40);

			button = new JButton("CLICK TO PLAY");
			
			button.setBounds((int) (85), (int) (125), 480, 150);
			button.setFont(font);
			button.addActionListener(this);
			add(button);

		
	}
	
	/**
	 * Draws the background of StartPanel 
	 * @post StartPanel is scaled to window
	 *  @param g the Graphics object on which to draw on 
	 */
	public void paintComponent (Graphics g) {
		super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background

	    int width = getWidth();
	    int height = getHeight();
	    
	    double ratioX = (double)width/GamePanel.DRAWING_WIDTH;
	    double ratioY = (double)height/GamePanel.DRAWING_HEIGHT;
	    
	    Graphics2D g2 = (Graphics2D)g;
	    AffineTransform at = g2.getTransform();
	    g2.scale(ratioX,ratioY);
	    
	    g.drawImage(background, 0, 0, GamePanel.DRAWING_WIDTH, GamePanel.DRAWING_HEIGHT, this);
	    
	    g2.setTransform(at);
	   
	}

	/**
	 * Calls for change of panel to the InstructionPanel when button is pressed
	 * @param e ActionEvent that triggers the method call
	 */
	public void actionPerformed(ActionEvent e) {
		w.changePanel("2");
		
	
	}


	
	
}
