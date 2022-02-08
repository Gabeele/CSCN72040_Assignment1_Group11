
public class MachineLearning implements MachineLearningInterface
{

	protected DataSet trainingDataSet;
	
	public int predictOrientation(DataPoint dataPoint, ClassifierNames classifier) {
		
		int orientation = -1;
		
		if (classifier == ClassifierNames.NEAREST_NEIGHBORS) {
			orientation = NearestNeighbor.Calculate(dataPoint, trainingDataSet);
		}
		else if (classifier == ClassifierNames.ANOTHER_CLASSIFIER) {
			orientation = AnotherClassifier.Calculate(dataPoint, trainingDataSet);
		}
		
		return orientation;
	}
	
	public void setTrainingData(DataSet dataSet) {
		trainingDataSet = dataSet;
	}
	
	
}
