package project3;

/**
 * Extends upon IllegalArgumentException to create InvalidWordLineException
 * @author Rohan Sazad
 * @version 11/22/2022
 * 
 */
public class InvalidWordLineException extends IllegalArgumentException{
	/**
	 * Construct InvalidWordLineException with String message
	 * @param message String
	 */
	public InvalidWordLineException(String message) {
		super(message);
	}
}
