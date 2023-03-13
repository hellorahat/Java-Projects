package project4;

import java.util.ArrayList;

/**
 * Creates a WordLine object with instances String data and ArrayList<Integer> lines
 * @author Rohan Sazad
 * @version 11/22/2022
 *
 */

public class WordLine {
	String word;
	ArrayList<Integer> lines;
	/**
	 * Constructs the WordLine object with data and ArrayList<Integer> lines
	 * @param data String
	 * @param line ArrayList<Integer>
	 * @exception InvalidWordLineException if parameter line is less than 1.
	 */
	public WordLine(String data, ArrayList<Integer> lines) {
		for(int i = 0; i < lines.size(); i++)
			if(lines.get(i) < 1) throw new InvalidWordLineException("Line can not be less than 1");
		this.word = data;
		this.lines = lines;
	}
}