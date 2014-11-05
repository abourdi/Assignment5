
public class ScoreCalculator {
/**
 * 
 * @author Amine
 * Created: November 1, 2014
 * Purpose: Driver that's called upon in ScoreGui
 * 
 */
public static double calculateAvgScore (double [] testScores, double [] testWeights) {
		/*
		 * Initializing weighted score
		 */
		double weightedScore=0;
		/*
		 * multiplying weights by test scores to find the weighted score
		 */
		for (int i=0; i<testScores.length; i++) {
			
			weightedScore += testScores[i] * testWeights[i];
			
		}
		
		/*
		 * returning the weighted score
		 */
		return weightedScore;
				
	}

}
