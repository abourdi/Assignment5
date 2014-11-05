import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ScoreGui extends JFrame implements ActionListener {
	
	/**
	 * 
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
	
	public ScoreGui () {
		
		jPnScores = new JPanel();
		jPnScores.setLayout(new GridLayout (5, 1));
		jPnScores.setBackground(Color.GRAY);
		
		jPnWeights = new JPanel();
		jPnWeights.setLayout(new GridLayout (5, 1));
		jPnWeights.setBackground(Color.GRAY);
		
		jPnButton = new JPanel();
		jPnButton.setBackground(Color.GRAY);
		
		jLblScores = new JLabel("Test Scores");
		jPnScores.add(jLblScores);
		
		jTxtScore1 = new JTextField(20);	
		jTxtScore2 = new JTextField(20);	
		jTxtScore3 = new JTextField(20);	
		jTxtScore4 = new JTextField(20);
				
		jPnScores.add(jTxtScore1);
		jPnScores.add(jTxtScore2);
		jPnScores.add(jTxtScore3);
		jPnScores.add(jTxtScore4);
		
		jLblWeights = new JLabel("Test Weights");
		jPnWeights.add(jLblWeights);
		
		jTxtWeight1 = new JTextField(20);
		jTxtWeight2 = new JTextField(20);
		jTxtWeight3 = new JTextField(20);
		jTxtWeight4 = new JTextField(20);
		
		jPnWeights.add(jTxtWeight1);
		jPnWeights.add(jTxtWeight2);
		jPnWeights.add(jTxtWeight3);
		jPnWeights.add(jTxtWeight4);
		
		add(jPnScores, BorderLayout.WEST);
		add(jPnWeights, BorderLayout.EAST);
		add(jPnButton, BorderLayout.SOUTH);
		
		jTxtWeightedScore = new JTextField(30);
		jPnButton.add(jTxtWeightedScore);
		jBtnCalculateButton = new JButton("Calculate Average");
		jPnButton.add(jBtnCalculateButton);
		jBtnCalculateButton.addActionListener(this);
		
		setVisible(true);
		//setSize(new Dimension(500,500));
		pack ();
		
	}
	
	public void actionPerformed(ActionEvent e) {
			
		double [] testScores = new double[4];
		testScores[0] = Double.parseDouble(jTxtScore1.getText());
		testScores[1] = Double.parseDouble(jTxtScore2.getText());
		testScores[2] = Double.parseDouble(jTxtScore3.getText());
		testScores[3] = Double.parseDouble(jTxtScore4.getText());
		
		double [] testWeights = new double[4];
		testWeights[0] = Double.parseDouble(jTxtWeight1.getText());
		testWeights[1] = Double.parseDouble(jTxtWeight2.getText());
		testWeights[2] = Double.parseDouble(jTxtWeight3.getText());
		testWeights[3] = Double.parseDouble(jTxtWeight4.getText());
		
		jTxtWeightedScore.setText("The weighted Score is: " + 
				ScoreCalculator.calculateAvgScore(testScores, testWeights));
		
			}
		

	
	public static void main(String[] args) {
	new ScoreGui();	

	}

}
