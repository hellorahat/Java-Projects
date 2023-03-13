package project3;

/**
 * Creates a WordLine object with instances String data and int line
 * @author Rohan Sazad
 * @version 11/22/2022
 *
 */

public class WordLine {
	String word;
	int line;
	/**
	 * Constructs the WordLine object with data and line
	 * @param data String
	 * @param line int
	 * @exception InvalidWordLineException if parameter line is less than 1.
	 */
	public WordLine(String data, int line) {
		if(line < 1) throw new InvalidWordLineException("Line can not be less than 1");
		this.word = data;
		this.line = line;
	}
}