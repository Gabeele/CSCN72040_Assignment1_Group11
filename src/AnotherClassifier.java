
public class AnotherClassifier extends Classifiers
{

	public static int Calculate(DataPoint dataPoint, DataSet trainingDataSet)
	{

		System.out.println("AnotherClassifier Predict method called");

		return -1;
	}


	protected static double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint)
	{

		System.out.println("AnotherClassifier distanceBetweenDataPoints method called");

		return 0.00;
	}
}
