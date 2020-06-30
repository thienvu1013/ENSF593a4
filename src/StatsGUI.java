import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * Implementation of the Stats GUI
 * The purpose of this class is to represent the user interface for the input and output of results from
 * the Stat class.
 *
 * @author Thien Nguyen
 */
public class StatsGUI extends JFrame implements ActionListener {
	private JLabel prompt = new JLabel("Next Grade");
	private JTextField inField;
	private JTextArea display;
	private JButton reset, displayStats;
	/**
	 * Defining the Stats object called gList, this will enable the usage of 
	 * the Stats class.
	 */
	private Stats gList;

	public StatsGUI(String title) { 
		/**
		 * Constructing gList
		 */
		gList = new Stats();
		
		inField = new JTextField(4);
		inField.addActionListener(this);
		
		display = new JTextArea("", 5, 20);
		
		reset = new JButton("RESET");
		reset.addActionListener(this);
		
		displayStats = new JButton("STATS");
		displayStats.addActionListener(this);

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(0, 2));
		inputPanel.add(prompt);
		inputPanel.add(inField);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 2));
		buttonPanel.add(displayStats);
		buttonPanel.add(reset);

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add("North", inputPanel);
		contentPane.add("Center", display);
		contentPane.add("South", buttonPanel);

		setSize(500, 200);
		setTitle(title);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		/**
		 * Handling of the user input event. Stats add() method is invoked
		 * to add the grade into the array. inField is then set to "" after user hit enter.
		 */

		if (e.getSource() == inField) {
			int number = Integer.parseInt(inField.getText());
			gList.add(number);
			inField.setText("");
		}
		
		/**
		 * Handling of the Stats button event. Stats toString() method is invoked
		 * and allow for the display of the results.
		 */
		if (e.getSource() == displayStats) {
			display.append(gList.toString());
		}
		
		/**
		 * Handling of the Reset button event. display button cleared out and gList is 
		 * then reinstantiated to reset stats array and count variable. 
		 */
		
		if (e.getSource() == reset) {
			display.selectAll();
			display.replaceSelection("");
			gList = new Stats();
		}

	}

	public static void main(String[] args) {
		new StatsGUI("Mean and median");
	}
}
