

public class AnotherClassifier extends Classifiers {

	boolean Predict (DataPoint dataPoint) {
		
		System.out.println("AnotherClassifier Predict method called");
		
		return true;
	}
	
	double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint) {

		System.out.println("AnotherClassifier distanceBetweenDataPoints method called");

		return 0.00;
	}
}

