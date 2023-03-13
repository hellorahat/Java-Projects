package project4;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

import javax.swing.*;

/**
 * Creates a JFrame GUI with a File and List menu
 * @author Rohan Sazad
 * @version 11/22/2022
 * 
 */
public class WordGUI extends JFrame implements ActionListener{
	/**
	 * TextArea that will contain the contents of opened file.
	 */
	TextArea textArea;
	/**
	 * TextArea that will contain the words that start with selected vowel when a vowel is selected from List menu
	 */
	TextArea wordLineArea;
	/**
	 * The sorted list that will be iterated through in order to list the words for wordLineArea
	 */
	SortedWordList sortedList = new SortedWordList();
	
	/**
	 * Constructs a GUI with the following parameters then calls the createMenu() method.
	 * @param title String
	 * @param height int
	 * @param width int
	 */
	public WordGUI(String title, int height, int width) {
		setTitle(title);
		setSize(height, width);
		setLayout(new GridLayout(1,2));
		Container contentPane = getContentPane();
//		// Create text areas, Column 0 will contain the contents of the original file, and Column 1 will contain UnsortedWordList, Column 2 will contain SortedWordList
		textArea = new TextArea();
		wordLineArea = new TextArea();
//		// Add the columns to the content pane
		contentPane.add(textArea, BorderLayout.EAST);
		contentPane.add(wordLineArea, BorderLayout.WEST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
	}
	
	/**
	 * Creates File and List menus. <p>
	 * File menu has options to open a file/quit. <p>
	 * List menu has options to select the vowels. Upon selecting a vowel, all words that start with that vowel in the file will be listed.
	 */
	private void createMenu() {
	   JMenuBar menuBar  = new JMenuBar();
	   // create menus
	   JMenu fileMenu = new JMenu("File");
	   JMenu listMenu = new JMenu("List");
	   // add menus to menuBar
	   menuBar.add(fileMenu);
	   menuBar.add(listMenu);
	   // create menu items for fileMenu
	   JMenuItem openItem = new JMenuItem("Open");
	   JMenuItem quitItem = new JMenuItem("Quit");
	   // create menu items for listMenu
	   JMenuItem aItem = new JMenuItem("A");
	   JMenuItem eItem = new JMenuItem("E");
	   JMenuItem iItem = new JMenuItem("I");
	   JMenuItem oItem = new JMenuItem("O");
	   JMenuItem uItem = new JMenuItem("U");
	   // add action listeners
	   openItem.addActionListener(this);
	   quitItem.addActionListener(this);
	   aItem.addActionListener(this);
	   eItem.addActionListener(this);
	   iItem.addActionListener(this);
	   oItem.addActionListener(this);
	   uItem.addActionListener(this);
	   // add menu items to fileMenu
	   fileMenu.add(openItem);
	   fileMenu.add(quitItem);
	   // add menu items to listMenu
	   listMenu.add(aItem);
	   listMenu.add(eItem);
	   listMenu.add(iItem);
	   listMenu.add(oItem);
	   listMenu.add(uItem);
	   // add the menu bar
	   setJMenuBar(menuBar);
	}
	
	/**
	 * Listens for the following options: <p>
	 * file open to select file <p>
	 * file quit to exit the GUI <p>
	 * list for all vowels to iterate through a sorted LinkedList and list the words that start with the corresponding vowel.
	 */
	public void actionPerformed(ActionEvent e) {
		String  menuName;
		menuName = e.getActionCommand();
		if(menuName.equals("Open"))
			openFile();
		else if(menuName.equals("Quit"))
			System.exit(0);
		else if(menuName.equals("A")) {
			wordLineArea.setText(null);
			WordList.WordListIterator sortedListIterator = sortedList.reset();
			while (sortedListIterator.hasNext()) {
				WordLine current = sortedListIterator.next();
				if(current.word.length() > 0)
					if(Character.toLowerCase(current.word.charAt(0)) == 'a') {
						wordLineArea.append(current.word + ": ");
						for(int i = 0; i < current.lines.size(); i++)
							wordLineArea.append(current.lines.get(i) + " ");
						wordLineArea.append("\n");
					}
			}
		}
		else if(menuName.equals("E")) {
			wordLineArea.setText(null);
			WordList.WordListIterator sortedListIterator = sortedList.reset();
			while (sortedListIterator.hasNext()) {
				WordLine current = sortedListIterator.next();
				if(current.word.length() > 0)
					if(Character.toLowerCase(current.word.charAt(0)) == 'e') {
						wordLineArea.append(current.word + ": ");
						for(int i = 0; i < current.lines.size(); i++)
							wordLineArea.append(current.lines.get(i) + " ");
						wordLineArea.append("\n");
					}
			}
		}
		else if(menuName.equals("I")) {
			wordLineArea.setText(null);
			WordList.WordListIterator sortedListIterator = sortedList.reset();
			while (sortedListIterator.hasNext()) {
				WordLine current = sortedListIterator.next();
				if(current.word.length() > 0)
					if(Character.toLowerCase(current.word.charAt(0)) == 'i') {
						wordLineArea.append(current.word + ": ");
						for(int i = 0; i < current.lines.size(); i++)
							wordLineArea.append(current.lines.get(i) + " ");
						wordLineArea.append("\n");
					}
			}
		}
		else if(menuName.equals("O")) {
			wordLineArea.setText(null);
			WordList.WordListIterator sortedListIterator = sortedList.reset();
			while (sortedListIterator.hasNext()) {
				WordLine current = sortedListIterator.next();
				if(current.word.length() > 0)
					if(Character.toLowerCase(current.word.charAt(0)) == 'o') {
						wordLineArea.append(current.word + ": ");
						for(int i = 0; i < current.lines.size(); i++)
							wordLineArea.append(current.lines.get(i) + " ");
						wordLineArea.append("\n");
					}
			}
		}
		else if(menuName.equals("U")) {
			wordLineArea.setText(null);
			WordList.WordListIterator sortedListIterator = sortedList.reset();
			while (sortedListIterator.hasNext()) {
				WordLine current = sortedListIterator.next();
				if(current.word.length() > 0)
					if(Character.toLowerCase(current.word.charAt(0)) == 'u') {
						wordLineArea.append(current.word + ": ");
						for(int i = 0; i < current.lines.size(); i++)
							wordLineArea.append(current.lines.get(i) + " ");
						wordLineArea.append("\n");
					}
			}
		}
	}
	
	/**
	 * Method to open a file.
	 */
	private void openFile() {
		JFileChooser chooser;
		int status;
		chooser = new JFileChooser( );
	    status = chooser.showOpenDialog(null);
	    if (status == JFileChooser.APPROVE_OPTION) {
	    	readSource(chooser.getSelectedFile());
	    }
	    else
	    	JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    }
	
	/**
	 * Reads the file into the left TextArea and construct a WordLine object that contains the word and the line
	 * number and then adds the WordLine object to a sorted LinkedList.
	 * @param chosenFile File
	 */
	private void readSource(File chosenFile) {
		textArea.setText(null); // clear current text in textArea if there is any
		String chosenFileName = chosenFile.getName();
		TextFileInput inFile = new TextFileInput(chosenFileName);
	    String line;
	    int subscript = 1;
	    line = inFile.readLine();
	    while (line != null) {
	    	String[] words = line.split("\\s+");
	    	for (int i = 0; i < words.length; i++) { // iterate through every word
	    		WordList.WordListIterator sortedListIterator = sortedList.reset();
	    		boolean listFound = false;
	    		while (sortedListIterator.hasNext()) { // iterate through the list for every word to see if there is a match
					WordLine current = sortedListIterator.next();
					if(current.word.equals(words[i])) { // if there is a match, see if the line already exists in the arraylist
						listFound = true;
						boolean match = false;
						for(int j = 0; j < current.lines.size(); j++) {
							if(current.lines.get(j) == subscript)
								match = true;
						}
						if(match == false)
							current.lines.add(subscript);
					}
	    		}
	    		if(listFound == false ) {
	    			ArrayList<Integer> arr = new ArrayList<Integer>();
	    			arr.add(subscript);
	    			WordLine wordLine = new WordLine(words[i], arr);
	    			sortedList.add(wordLine);
	    		}
	    	}
	    	textArea.append(Integer.toString(subscript++)+": ");
	    	textArea.append(line+"\n");
	    	line = inFile.readLine();
	    }
	}
}
