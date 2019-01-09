package piano;

import java.util.ArrayList;

import javazoom.jl.decoder.JavaLayerException;
/**
 * Records the keys pressed on the piano and the timestamp they were pressed
 * @author rithika
 *
 */
public class KeyStrokes {

	private ArrayList<Long> timestamps;
	private ArrayList<Key> keys;
	private long startTime;
	private Sound sound;

	/**
	 * Constructs a KeyStrokes object
	 * Sets startTime equal to when object is made
	 */
	public KeyStrokes() {
		timestamps = new ArrayList<Long>();
		keys = new ArrayList<Key>();
		startTime = System.currentTimeMillis();
		sound = new Sound("");
	}

	/**
	 * Adds to the ArrayList of keys recorded and the time at which it is played
	 * @param k the key to be added to the ArrayList
	 */
	public void addKeyStroke(Key k) {

		timestamps.add(System.currentTimeMillis() - startTime);
		
		keys.add(k);
	}
/**
 * Plays back the sequence of keys that were recorded
 * @pre the ArrayList of keys is not null
 * @post the sounds for each key is played using the Sound class
 * 
 */
	public void playBack() {
		if (keys != null) {
			int i = 0;
			while (i < timestamps.size()) {
				try {
					Key k = keys.get(i);
					String mp3 = k.getPianoLetter() + ".mp3";
					if (i == 0) {
						Thread.sleep(timestamps.get(i));
					} else {
						Thread.sleep(timestamps.get(i) - timestamps.get(i - 1));
					}
					try {
						sound.playSound(mp3);
					} catch (JavaLayerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i++;

			}
		}
	}

	/**
	 * Returns the keys and time they were played at in the order (key, timestamp), for each key
	 * @return keys and timestamps as a String
	 */
	public String toString() {
		String output = "";
		for (int i = 0; i < timestamps.size(); i++) {
			output += ("(" + keys.get(i).getPianoLetter() + ", " + timestamps.get(i) + ")\n");
		}
		return output;

	}
	
	
}
