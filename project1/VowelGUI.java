package project1;
import java.awt.*;
import javax.swing.JFrame;


// This class creates the GUI to display vowelCount
public class VowelGUI extends JFrame {
	public VowelGUI() {
		setTitle("VowelGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(915, 365);
		setLayout(new GridLayout(1,2)); // Set layout to allow 2 text areas to be added
		setVisible(true);
	}
}
