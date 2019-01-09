package piano;


import java.awt.Color;

import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.awt.Graphics;

import gui.GamePanel;


import javax.swing.JPanel;
/**
 * 
 * This class draws the piano and initializes the keys 
 * @author Rithika 
 */
public class Piano {
	
	//Key [] keys = new Key [13];
	//Key key;
	
	private Key[] octave;
	private Key[] sharps;
	private Sound s;
	
	
	/**
	 * Constructs a Piano object that includes an octave from piano key C4 to C5, as well as the sharps
	 */
	public Piano() {
		
		Key c4 = new Key("c4","S", false);
		
		Key d = new Key("d", "D", false);
		Key e = new Key("e", "F", false);
		Key f = new Key("f", "G", false);
		Key g = new Key("g", "H", false);
		Key a = new Key("a", "J", false);
		Key b = new Key("b", "K", false);
		Key c5 = new Key("c5", "L", false);
		
		Key cSharp = new Key("c#", "E", true);
		Key dSharp = new Key("d#", "R", true);
		
		Key fSharp = new Key("f#", "Y", true);
		Key gSharp = new Key("g#", "U", true);
		Key aSharp = new Key("a#", "I", true);
		
		
		Key[] octaveC = {c4,d,e,f,g,a,b,c5};
		octave = octaveC;
		
		Key[] sharpsC = {cSharp,dSharp, fSharp, gSharp, aSharp};
		sharps = sharpsC;
	}
	
	/**
	 * returns key at a certain index i in octave
	 * @param i the index at which a value is to be accessed
	 * @return key at index i in octave
	 *  
	 */
	public Key getOctaveKey(int i) {
		//System.out.println(octave[i]);
		return octave[i];
	}
	/**
	 * returns key at a certain index i in sharps
	 * @param i the index at which a value is to be accessed
	 * @return key at index i in sharps
	 */
	public Key getSharpsKey(int i) {
		return sharps[i];
	}
	
	/**
	 * Draws the full piano  
	 * @post piano is drawn at (x,y) (GamePanel.DRAWING_WIDTH/2 - 230, 150)
	 * @param g the Graphics object on which to draw the note on
	 */
	public void draw(Graphics g) {
		 int x = GamePanel.DRAWING_WIDTH/2 - 230;
		 int y = 150;
		 int width = octave[0].getWidth();
		for(int i = 0; i<octave.length; i++) {
			octave[i].draw(g, x, y);
			x+= width;
		}
		
		int x2 = 2*width/3 + GamePanel.DRAWING_WIDTH/2 - 230;
		for(int i = 0; i<2; i++) {
			sharps[i].draw(g, x2, y);
			x2+= width;
		}
		
		x2 += width;
		for(int i = 2; i<sharps.length; i++) {
			sharps[i].draw(g, x2, y);
			x2+= width;
		}
	}
	
	
	
	

}