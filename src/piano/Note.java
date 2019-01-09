package piano;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 * A class that should be used in GamePanel when a key is pressed.
 * 
 * @author amandasun
 *
 */
public class Note {
	Key thiskey;
	private int x, y, r;

	/**
	 * Constructs a Note to be printed out on screen
	 * 
	 * @param k piano key to convert to a note
	 * @param x x value on top left corner of note
	 * @param y y value on top left corner of note
	 * @param r radius of note
	 */
	public Note(Key k, int x, int y, int r) {
		thiskey = k;
		this.x = x;
		this.y = y;
		this.r = r;
	}

	/**
	 * Has the note scroll across the screen
	 * @param speed the speed at which the note scrolls
	 */
	public void translate(int speed) {
		x -= speed;
	}

	/**
	 * Draws the note 
	 * @param g the Graphics object on which to draw the note on
	 */
	public void draw(Graphics g) {
		g.drawOval(x, y, 2 * r, 2 * r);
	}
}
