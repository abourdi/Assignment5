
public class ScoreCalculator {
/*
 * 
 */
public static double calculateAvgScore (double [] testScores, double [] testWeights) {
		double weightedScore=0;
		
		for (int i=0; i<testScores.length; i++) {
			
			weightedScore += testScores[i] * testWeights[i];
			
		}
		
		return weightedScore;
				
	}

}
