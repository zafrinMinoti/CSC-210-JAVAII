// Zafrin Minoti
// CSC 210
// Homework 6

import javax.swing.*;
import java.awt.event.*;

/**
	This class translates 3 Latin words to English
	in a GUI envirnment
*/

public class LatinTranslator extends JFrame
{
	// Fields
	private JButton word1, word2, word3;
	private JPanel panel1;
	private final int W = 300;
	private final int H = 70;

	/**
		Constructor
	*/

	public LatinTranslator()
	{
		// override first superclass methods 
		setTitle("Translate Latin Words");
		setSize(W,H);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the buttons for the latin words
		word1 = new JButton("sinister");
		word2 = new JButton("dexter");
		word3 = new JButton("medium");

		// Register an event listener for all buttons
		word1.addActionListener(new ButtonListener());
		word1.addActionListener(new ButtonListener());
		word1.addActionListener(new ButtonListener());

		// Create a panel and add the buttons to it
		panel1 = new JPanel();
		panel1.add(word1);
		panel1.add(word2);
		panel1.add(word3);
		
		add(panel1);		// add panel1 to the content pane
		setVisible(true);	// Display the window 
	}

	/**
		Private inner class that handels the event
		when the user wante to translate a word
	*/

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Get action commend (latin word choosen)
			String actionCommand = e.getActionCommand();

			// Determine which latin word was selected
			// and display the english word for it
			switch(e.actionCommand)
			{
				case "sinister":
					JOptionPane.showMessageDialog(null, "left");
					break;
				case "dexter":
					JOptionPane.showMessageDialog(null, "right");
					break;
				case "medium":
					JOptionPane.showMessageDialog(null, "center");
					break;
			}
		}
	}

	/**
		Main method
	*/

	public static void main(String[] args)
	{
		new LatinTranslator();
	}
}
