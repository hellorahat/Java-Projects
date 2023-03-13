package project3;

/**
 * This class constructs a WordNode
 * @author Rohan Sazad
 * @version 11/22/2022
 */
public class WordNode {
	WordLine data;
	WordNode next;
	/**
	 * Creates a WordNode with the following parameters
	 * @param data String
	 * @param next WordNode
	 */
	public WordNode(WordLine data, WordNode next)  {
		this.data = data;
		this.next = next;
	}  // constructor
	
	/**
	 * Creates a WordNode with no parameters
	 */
	public WordNode()  {
		this.data = null;
		this.next = null;
	}  // constructor
	
	/**
	 * Creates a WordNode with only the data parameter
	 * @param data String
	 */
	public WordNode(WordLine data)  {
		this.data = data;
		this.next = null;
	}  // constructor
}