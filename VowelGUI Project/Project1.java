package project1;
import java.awt.*;

import temp.project1.TextFileInput;
public class Project1 {

	public static void main(String[] args) {
		String path = "input.txt";
		int[] vowelArr = vowelCount(path);
		display(path, vowelArr);
	}
	
	// This method will return the amount of vowels as an integer array
	public static int[] vowelCount(String path) {
		TextFileInput file = new TextFileInput(path);
		int vowelCount[] = new int[5]; // The vowels a,e,i,o,u are indexes 0-4 respectively
		// The following lines will read through the file to count the vowels
		String s;
		s = file.readLine();
		while (s != null) {
			s.toLowerCase(); // Convert to lower case to compare
			// Read through every character of current line and add to vowelCount array when a vowel is found.
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'a') { 
					vowelCount[0]++;
					continue;
				}
				if(s.charAt(i) == 'e') {
					vowelCount[1]++;
					continue;
				}
				if(s.charAt(i) == 'i') {
					vowelCount[2]++;
					continue;
				}
				if(s.charAt(i) == 'o') {
					vowelCount[3]++;
					continue;
				}
				if(s.charAt(i) == 'u') {
					vowelCount[4]++;
					continue;
				}
			}
			// Store next line into string s when completed reading the current line
			s = file.readLine();
		}
		return vowelCount;
	}
	
	// This method will display the contents of the input file and the vowel count in a GUI
	public static void display(String path, int[] vowelCount) {
		TextFileInput file = new TextFileInput(path);
		VowelGUI frame = new VowelGUI();
		Container contentPane = frame.getContentPane();
		// Create text areas, Column 0 will contain the contents of the original file, and Column 1 will contain vowelCount
		TextArea col0 = new TextArea();
		TextArea col1 = new TextArea();
		// Add the columns to the content pane
		contentPane.add(col0);
		contentPane.add(col1);
		// Append contents of file to Column 0
		String s;
		s = file.readLine();
		while (s != null) {
			col0.append(s + "\n");
			s = file.readLine();
		}
		// Append vowelCount to Column 1
		col1.append("'a' count: " + vowelCount[0] + "\n");
		col1.append("'e' count: " + vowelCount[1] + "\n");
		col1.append("'i' count: " + vowelCount[2] + "\n");
		col1.append("'o' count: " + vowelCount[3] + "\n");
		col1.append("'u' count: " + vowelCount[4] + "\n");
	}
}
