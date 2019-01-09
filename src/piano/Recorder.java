package piano;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
// hi it's rithika
/**
 * Represents the recorder class that records the sounds that the Keys play 
 * @author Amanda 
 *
 */
public class Recorder {

	private static int MEASURE_NUMBER = 1;
	private final int BEATS_PER_MEASURE;
	private ArrayList<Key> keysRecorded;
	private ArrayList<Integer> meas;

/**
 * Constructs a new Recorder object
 * @param bpm beats per measure
 */
	public Recorder(int bpm) {
		BEATS_PER_MEASURE = bpm;
		keysRecorded = new ArrayList<Key>();
		meas = new ArrayList<Integer>(); 

	}
	
//	public Key record(Key k) {
//		keysRecorded.add(k);
//		return k;
//	}
//	
	/**
	 * Records every time a key is pressed
	 * @param k key to be recorded
	 * @param measNum measure number at which key was played
	 */
	public void record(Key k, int measNum) {
		meas.add(measNum);
		keysRecorded.add(k);
		
	}
	
	/**
	 * Returns a key at a certain measure
	 * @param measure measure at which to find a key
	 * @return key recorded at measure
	 */
	public Key returnKey(int measure) {
		for (int i = 0; i< meas.size(); i++) {
			if(measure == meas.get(i))
				return keysRecorded.get(i);
		}
		return null; // potential bug
	}
	
	/**
	 * Prints out all the keys recorded and the measures that they were recorded at
	 */
	public void printKeys() {
		for (int i = 0; i< meas.size(); i++) {
			System.out.println("key:" + keysRecorded.get(i));
			System.out.println("measure:" + meas.get(i));
			
		}
	}
	
	
	
	
}
