import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * 
 * @author Amine
 * Created: November 1, 2014
 * Purpose: Used to find the Weighted score of 4 tests
 *
 */
public class ScoreGui extends JFrame implements ActionListener {
	
	/*
	 * All the initializations for the variables
	 */
	private static final long serialVersionUID = 629353668517864690L;
	JTextField jTxtScore1;
	JTextField jTxtScore2;
	JTextField jTxtScore3;
	JTextField jTxtScore4;
	JTextField jTxtWeight1;
	JTextField jTxtWeight2;
	JTextField jTxtWeight3;
	JTextField jTxtWeight4;
	JButton jBtnCalculateButton;
	JPanel jPnScores;
	JPanel jPnWeights;
	JPanel jPnButton;
	JLabel jLblScores;
	JLabel jLblWeights;
	JTextField jTxtWeightedScore;
	
	/*
	 * beginning of ScoreGui
	 */
	public ScoreGui () {
		
		/*
		 * creating new panel for scores and setting GridLayout and Color
		 */
		jPnScores = new JPanel();
		jPnScores.setLayout(new GridLayout (5, 1));
		jPnScores.setBackground(Color.GRAY);
		
		/*
		 * creating new panel for weights and setting GridLayout and Color
		 */
		jPnWeights = new JPanel();
		jPnWeights.setLayout(new GridLayout (5, 1));
		jPnWeights.setBackground(Color.GRAY);
		
		/*
		 * creating new panel for the button
		 */
		jPnButton = new JPanel();
		jPnButton.setBackground(Color.GRAY);
		
		/*
		 * Creating new label for the frame
		 */
		jLblScores = new JLabel("Test Scores");
		jPnScores.add(jLblScores);
		
		/*
		 * setting length for the text fields
		 */
		jTxtScore1 = new JTextField(20);	
		jTxtScore2 = new JTextField(20);	
		jTxtScore3 = new JTextField(20);	
		jTxtScore4 = new JTextField(20);
		
		/*
		 * adding text fields to the panel
		 */
		jPnScores.add(jTxtScore1);
		jPnScores.add(jTxtScore2);
		jPnScores.add(jTxtScore3);
		jPnScores.add(jTxtScore4);
		
		/*
		 * creating label for frame and adding it to the panel
		 */
		jLblWeights = new JLabel("Test Weights");
		jPnWeights.add(jLblWeights);
		
		/*
		 * setting length for text fields
		 */
		jTxtWeight1 = new JTextField(20);
		jTxtWeight2 = new JTextField(20);
		jTxtWeight3 = new JTextField(20);
		jTxtWeight4 = new JTextField(20);
		
		/*
		 * adding weight text fields to the panel
		 */
		jPnWeights.add(jTxtWeight1);
		jPnWeights.add(jTxtWeight2);
		jPnWeights.add(jTxtWeight3);
		jPnWeights.add(jTxtWeight4);
		
		/*
		 * adding panels to the frame and arranging them
		 */
		add(jPnScores, BorderLayout.WEST);
		add(jPnWeights, BorderLayout.EAST);
		add(jPnButton, BorderLayout.SOUTH);
		
		/*
		 * adding buttons to panel
		 */
		jTxtWeightedScore = new JTextField(30);
		jPnButton.add(jTxtWeightedScore);
		jBtnCalculateButton = new JButton("Calculate Average");
		jPnButton.add(jBtnCalculateButton);
		
		/*
		 * telling Action listener to listn to this input
		 */
		jBtnCalculateButton.addActionListener(this);
		
		/*
		 * making the Gui visible and packing it
		 */
		setVisible(true);
		pack ();
		
	}
	/*
	 * Method to listen to the button
	 */
	public void actionPerformed(ActionEvent e) {
		
		/*
		 * creating an array for test scores
		 */
		double [] testScores = new double[4];
		testScores[0] = Double.parseDouble(jTxtScore1.getText());
		testScores[1] = Double.parseDouble(jTxtScore2.getText());
		testScores[2] = Double.parseDouble(jTxtScore3.getText());
		testScores[3] = Double.parseDouble(jTxtScore4.getText());
		
		/*
		 * creating an array for test weights
		 */
		double [] testWeights = new double[4];
		testWeights[0] = Double.parseDouble(jTxtWeight1.getText());
		testWeights[1] = Double.parseDouble(jTxtWeight2.getText());
		testWeights[2] = Double.parseDouble(jTxtWeight3.getText());
		testWeights[3] = Double.parseDouble(jTxtWeight4.getText());
		
		/*
		 * setting text for the text field where the weighted sscore will be displayed
		 */
		jTxtWeightedScore.setText("The weighted Score is: " + 
				ScoreCalculator.calculateAvgScore(testScores, testWeights));
		
			}
		

	/*
	 * main method
	 */
	public static void main(String[] args) {
	new ScoreGui();	

	}

}
