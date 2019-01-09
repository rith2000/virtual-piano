package piano;


import java.awt.Graphics;
import java.io.FileInputStream;
import java.awt.*;
import javax.swing.*;
/**
 * This class sets properties of a Piano's Key object. 
 * @author rithika, amanda, and keertana
 *4/5/18 V1
 */
public class Key {
	
	private String pianoLetter;
	private Sound sound;
	private boolean isPressed;
	private boolean isBlack;
	private int width, height;
	private String keyLetter;
	
	
	/**
	 * Creates a piano key with a letter, sound and color
	 * @post width of black keys is set to (int) (0.5 * 75)
	 * 		height of black keys is set to (int) (3.5 * 75)
	 * 		width of white keys is set to (int) (0.8 *75
	 * 		height of white keys is set to (int) (5.5 * 75)
	 * @param l the piano letter that identifies the key
	 * @param s the sound specified by the key
	 *  @param isBlack whether the key is black or not
	 */
	public Key(String l, Sound s, boolean isBlack) {
		pianoLetter = l;
		sound = s; 
		isPressed = false;
		keyLetter = "undecided";
		this.isBlack = isBlack;
		if(isBlack) {
			width = (int) (0.5 * 75);
			height = (int) (3.5 * 75);
			//change width and height
		}
		else {
			width = (int) (0.8 *75);
			height = (int) (5.5 * 75);
			//change width and height
		}
	}
	
	/**
	 * Creates a piano key with a piano letter, key letter, and color
	 * @post width of black keys is set to (int) (0.5 * 75)
	 * 		height of black keys is set to (int) (3.5 * 75)
	 * 		width of white keys is set to (int) (0.8 *75
	 * 		height of white keys is set to (int) (5.5 * 75)
	 * @param l the piano letter that identifies the key
	 * @param k the keyboard letter to press that correlates to the piano letter
	 * @param isBlack whether the key is black or not
	 */
	public Key(String l, String k, boolean isBlack) {
		pianoLetter = l;
		isPressed = false;
		keyLetter = k;
		this.isBlack = isBlack;
		if(isBlack) {
			width = (int) (0.5 * 75);
			height = (int) (3.5 * 75);
			//change width and height
		}
		else {
			width = (int) (0.8 *75);
			height = (int) (5.5 * 75);
			//change width and height
		}
	}
	
	
	
	/**
	 * Sets isPressed to true when this piano key is pressed
	 */
	public void keyPressed() {
		isPressed = true;
	}
	
	/**
	 * Set isPressed to false when this piano key is not pressed
	 */
	public void keyReleased() {
		isPressed = false;
	}
	
	/**
	 * Returns the identifying letter of the key.
	 * @return the letter as a String
	 */
	public String getPianoLetter() {
		return pianoLetter;
	}
	
	/**
	 * Returns the identifying letter of the key.
	 * @return the letter as a String
	 */
	public String getKeyLetter() {
		return keyLetter;
	}
	
	/**
	 * Returns the identifying sound of the key.
	 * @return the sound as a String
	 */
	public Sound getSound() {
		return sound;
	}
	
	/**
	 * @return width of key
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * @return height of key
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Returns String version of the key.
	 * @return letter as a String
	 */
	public String toString() {
		return pianoLetter;
	}
	
	
	/**
	 * Draws one key
	 * @post if the key is being pressed, the key is yellow, otherwise it is black or white depending on the key
	 *       each key has a black outline
	 *       each key's piano letter is printed above or below them
	 *       each key's keyboard letter is printed in them
	 * @param g the Graphics object the method is acting on.
	 * @param x the x-value of the key's top left corner 
	 * @param y the y-value of the key's top left corner 
	 * @post calls super.paintComponent, makes rectangle of (x,y,width, height) to draw key, 
	 * has sharp notes filled in black and normal notes filled in white, outline color of key is black.
	 */
		public void draw(Graphics g, int x, int y)  
		{

		
			
			if(isPressed) {
				g.setColor(Color.YELLOW);
				g.fillRect(x, y, width, height);
			}else if(!isBlack) {
				g.setColor(Color.WHITE);
				g.fillRect(x, y, width, height);
				g.drawString(pianoLetter, x + 20, y+ 430);
				g.setColor(Color.BLACK);
				g.drawString(keyLetter, x + 5, y+ 405);
				
			}
			else {
				g.setColor(Color.BLACK);
				g.fillRect(x, y, width, height);
				g.setColor(Color.WHITE);
				g.drawString(pianoLetter, x + 15, y-10);
				
				g.drawString(keyLetter, x + 5, y+255);
			}
			
			g.setColor(Color.BLACK);
			g.drawRect(x, y, width, height); //black outline for each key
			
			
		}
	
	
	

}
