package project4;

/**
 * extends upon WordList to create a SortedWordList with an add method
 * @author Rohan Sazad
 * @version 11/22/2022
 * 
 */
public class SortedWordList extends WordList {
	/**
	 * Adds a node containing the String to the SortedWordList while keeping the list lexicographical.
	 * @param wordLine WordLine
	 */
	public void add(WordLine wordLine) {
		WordNode previousNode = null;
		WordNode currentNode = getFirst();
		WordNode wordNode = new WordNode(wordLine);
        
		while(currentNode != null) {
            // in the loop we must check to see if wordNode is greater than or equal to currentNode, if it is, we just move on to the next node. always keep the previous node in mind because we must
            // link it to the current, while linking the current to the next if a match is found
			if(currentNode.data != null) {
				if(wordLine.word.compareToIgnoreCase(currentNode.data.word) < 0) {
					if(previousNode.data != null) {
						// if previousNode is known while wordNode being less than currentNode, it means it must be placed in between the two nodes because it is greater than or equal to previousNode 
	                	// and less than currentNode
						previousNode.next = wordNode;
						wordNode.next = currentNode;
	                    setLength(getLength() + 1);
	                    break;
					}
					else { 
						// wordNode is alphabetically less than currentNode and previousNode is the first node (null)
						// so place after first node
						previousNode.next = wordNode;
						wordNode.next = currentNode;
						setLength(getLength() + 1);
						break;		
					}
				}
			}
			// set previousNode to currentNode, and currentNode to the next node and then loop
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		if(wordNode.next == null) { // if wordNode was not placed in the list after the loop, it means that it is alphabetically greater than every string in the list. So append it to the end
			getLast().next = wordNode;
			setLast(wordNode);
			setLength(getLength() + 1);
		}
	}
}