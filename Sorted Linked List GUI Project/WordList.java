package project4;

/**
 * Class to construct and get information from WordList
 * @author Rohan Sazad
 * @version 11/22/2022
 */
public class WordList {
	private WordNode first; 
	private WordNode last;
	private int length;
	/**
	 * Creates a WordList and sets the first and last values to the first WordNode, and sets the length to 0.
	 */
	public WordList() {
		WordNode ln = new WordNode();
		first = ln;
		last = ln;
		length = 0;
	}
	
	/**
	 * returns WordNode value which is the the last WordNode of WordList
	 * @return WordNode
	 */
	public WordNode getLast() {
		return last;
	}
	
	/**
	 * returns WordNode value which is the the first WordNode of WordList
	 * @return WordNode
	 */
	public WordNode getFirst() {
		return first;
	}
	
	/**
	 * returns int value of the length of WordList
	 * @return int
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * sets the length of WordList
	 * @param i int value
	 */
	public void setLength(int i) {
		length = i;
	}
	
	/**
	 * sets the last node of WordList
	 * @param ln WordNode
	 */
	public void setLast(WordNode ln) {
		last = ln;
	}	
	/**
	 * 
	 * @author Rohan Sazad
	 * @version 10/27/2022
	 */
	public class WordListIterator {
		private WordNode node;
		/**
		 * Constructs an Iterator for the WordList
		 * @param first WordNode
		 */
		public WordListIterator(WordNode first)  {
			node = first;
		}
		/**
		 * 
		 * @return boolean value based on whether or not the WordList has another term after its current one
		 */
		public boolean hasNext()  {
			return(node != null);
		}	   
		/**
		 * sets the Iterator to the next node
		 * @return String containing the data of current node
		 */
		public WordLine next()  {
			if (node == null)
				throw new NullPointerException("Linked list empty.");
			WordLine currentData = node.data;
			node = node.next;
			return currentData;
		}
	}
	/**
	 * returns an Iterator to read through the WordList
	 * @return Iterator
	 */
	public WordListIterator reset() {
		return new WordListIterator(first.next);
	}
}
