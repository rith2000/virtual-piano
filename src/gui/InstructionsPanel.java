package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
/**
 *  Displays the instructions for using PBoard on the screen
 * @author rithika
 *
 */
public class InstructionsPanel extends JPanel implements ActionListener{

	private Image background;
	private JButton cont;
	private Main w;
	
	/**Creates a InstructionsPanel that the user sees after the StartPanel
	 * @post background with instructionsBackground.png picture
	 * 		Layout is SpringLayout
	 * 		Continue button is created: Its font is Sans, bold, and 20 pt.   
	 * @param w Main object that uses this InstructionsPanel object
	 */
	public InstructionsPanel(Main w) {
		background = (new ImageIcon("instructionsBackground.png")).getImage();
		this.w = w;
		
		setLayout(new SpringLayout());

		 	Font font = new Font("Sans", Font.BOLD, 20);
		 
			cont = new JButton("CONTINUE");
		
			cont.setFont(font);
		
			cont.setBackground(Color.BLUE);
		
			add(cont);
			
			cont.addActionListener(this);
	}

	/**
	 * Draws the background of InstructionsPanel 
	 * @post InstructionsPanel is scaled to window
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
	 * Calls for change of panel to the GamePanel when button is pressed
	 * @param e ActionEvent that triggers the method call
	 */
	public void actionPerformed(ActionEvent e) {
		
		w.changePanel("3");
	
		
	}

	
}

	