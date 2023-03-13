package project2;

import java.awt.*;
import java.util.StringTokenizer;
import javax.swing.JFrame;

/**
 * This class takes constructs a JFrame GUI using a TextFileInput, UnsortedWordList, and SortedWordList
 * @author Rohan Sazad
 * @version 10/27/2022
 */
public class WordGUI extends JFrame{
	/**
	 * Appends contents of file to UnsortedWordList, and adds them to SortedWordList, then adds file and both lists to the GUI as content pane.
	 * @param TextFileInput
	 * @param UnsortedWordList
	 * @param SortedWordList
	 */
	public WordGUI(TextFileInput myFile, UnsortedWordList unsortedList, SortedWordList sortedList) {
		StringTokenizer myTokens;
		setTitle("WordGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(915, 365);
		setLayout(new GridLayout(1,3));
		Container contentPane = getContentPane();
		// Create text areas, Column 0 will contain the contents of the original file, and Column 1 will contain UnsortedWordList, Column 2 will contain SortedWordList
		TextArea originalColumn = new TextArea();
		TextArea unsortedColumn = new TextArea();
		TextArea sortedColumn = new TextArea();
		// Add the columns to the content pane
		contentPane.add(originalColumn);
		contentPane.add(unsortedColumn);
		contentPane.add(sortedColumn);
		String line = myFile.readLine();
		while(line != null) {
			myTokens = new StringTokenizer(line," ");
			String[] words = new String[myTokens.countTokens()];
			int i=0;
			while (myTokens.hasMoreTokens()) {
				words[i]=myTokens.nextToken();
				i++;
		    }
			for (int j=0;j<words.length;j++) {
				unsortedList.append(words[j]);
				sortedList.add(words[j]);
			}
			originalColumn.append(line + "\n");
			line = myFile.readLine();
		}
		WordList.WordListIterator unsortedListIterator = unsortedList.reset();
		WordList.WordListIterator sortedListIterator = sortedList.reset();
		while (unsortedListIterator.hasNext()) {
			unsortedColumn.append(unsortedListIterator.next() + "\n");
			sortedColumn.append(sortedListIterator.next() + "\n");
		}
	}
}
