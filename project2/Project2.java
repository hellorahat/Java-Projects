package project2;

public class Project2 {
	public static void main(String[] args) {
		TextFileInput myFile = new TextFileInput("input.txt");
		UnsortedWordList unsortedList = new UnsortedWordList();
		SortedWordList sortedList = new SortedWordList();
		WordGUI wordListGui = new WordGUI(myFile, unsortedList, sortedList);
		wordListGui.setVisible(true);
	}
}
