import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test5_9 {
	public static void main(String[] args) {
		JFrame window = new JFrame("Selection Sort");
		JTextArea textArea = new JTextArea();
		Font newfont = new Font("Tamaho",Font.BOLD,16);
		int array[] = {11, 12, 4, 77, 2};
		String output;
		output = "Data items in original order\n";
		for(int n = 0 ; n < array.length; n++)
			output += " " + array[n];
		selectionSort(array);
		output += "\n\nData items in ascending order\n";
		for(int n = 0 ; n < array.length; n++)
			output += " " + array[n];
		textArea.setForeground(Color.blue);
		textArea.setFont(newfont);
		textArea.setText(output);
		// add component
		window.add(textArea);
		window.setSize( 320,240);
		window.setVisible(true);
		window.setDefaultCloseOperation(
		JFrame.EXIT_ON_CLOSE);
	}
	public static void selectionSort(int a[]){
		//{11, 12, 4, 77, 2}
		for(int pass = a.length - 1 ; pass > 0 ; pass--) {
			int max = pass;
			
			for (int n = pass ; n >= 0 ; n--)
				if (a[n] < a[max]) {
					max = n;
				}
			
			if (pass != max) {
				int temp = a[pass];
				a[pass] = a[max];
				a[max] = temp;
			}
		}
	}
}