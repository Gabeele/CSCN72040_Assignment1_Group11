
public class AnotherClassifier extends Classifiers
{

	@Override
	boolean PredictPoint(DataPoint dataPoint)
	{

		System.out.println("AnotherClassifier Predict method called");

		return true;
	}

	@Override
	double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint)
	{

		System.out.println("AnotherClassifier distanceBetweenDataPoints method called");

		return 0.00;
	}
}
