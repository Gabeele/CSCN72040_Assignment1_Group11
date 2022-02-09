/**
 * {@summary Class provides static methods another classifier}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */
public class AnotherClassifier extends Classifiers
{
	/**
	 * {@summary Calculate method in AnotherClassifier is a place holder for a actual calculate function that will override if there were 
	 * another algorithm to use }
	 * @param dataPoint
	 * @param trainingDataSet
	 * @return
	 */
	public static int Calculate(DataPoint dataPoint, DataSet trainingDataSet)
	{
		System.out.println("AnotherClassifier Predict method called");
		return 0;
	}

	/**
	 * {@summary Calculate method in AnotherClassifier is a place holder for a actual distanceBetweenDataPoints function 
	 * that will override if there were another algorithm to use }
	 * @param predictingPoint
	 * @param testPoint
	 * @return
	 */
	protected static double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint)
	{
		System.out.println("AnotherClassifier distanceBetweenDataPoints method called");
		return 0.00;
	}
}
