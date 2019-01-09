package piano;

import java.awt.Graphics;
/**
 * Represents the sheet music to be transcribed
 * @author amandasun
 *
 */
public class Sheet {
	int x,y,width,height,margin,speed;
	
	/**
	 * Constructs a Sheet object
	 * @param x x value on top left corner of sheet
	 * @param y y value on top left corner of sheet
	 * @param width width of entire sheet
	 * @param height height of entire sheet
	 */
	public Sheet(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		margin = height/4;
	}
	
	/**
	 * Makes Sheet sidescroll as the user plays the piano
	 * @param speed speed the speed at which the sheet scrolls
	 */
	public void translate(int speed) {
		x -= speed;
	}
	/**
	 * Draws the lines that appear in sheet music
	 * @param g the Graphics object on which to draw the sheet on
	 */
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);
		g.drawLine(x, y+margin, x+width, y+margin);
		g.drawLine(x, y+2*margin, x+width, y+2*margin);
		g.drawLine(x, y+3*margin, x+width, y+3*margin);
		
	}
} 
