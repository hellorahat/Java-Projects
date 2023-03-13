package project2;

/**
 * extends upon WordList to create an UnsortedWordList with an append method
 * @author Rohan Sazad
 * @version 10/27/2022
 */
public class UnsortedWordList extends WordList {
	/**
	 * Appends a node containing the String to the end of the UnsortedWordList
	 * @param word String
	 */
		WordNode n = new WordNode(word);
		getLast().next = n;
		setLast(n);
		setLength(getLength() + 1);
	}
}